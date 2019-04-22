package source;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Farkas
 */
public class Session implements Serializable {

    private User user;
    private LocalDateTime lastLogin;

    /**
     *
     * @throws SessionExpiredException
     */
    public Session() throws SessionExpiredException {
        this.user = null;
        this.lastLogin = LocalDateTime.now();

        deserialize();
    }

    /**
     * Serialize session
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void serialize() throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream("./data/session.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this.user);
        out.writeObject(this.lastLogin);

        out.close();
        fileOut.close();
    }

    /**
     * Deserialize session
     *
     * @throws SessionExpiredException
     */
    public void deserialize() throws SessionExpiredException {
        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("./data/session.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.user = (User) in.readObject();
            this.lastLogin = (LocalDateTime) in.readObject();
            //Set it to null if 
            if (LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) > this.lastLogin.toEpochSecond(ZoneOffset.UTC)+ 172800  && this.user != null) {
                this.user = null;
                this.lastLogin = null;
                throw new SessionExpiredException("Session has expired!");
            }
            in.close();
            fileIn.close();
        } catch (FileNotFoundException ex) {
            
            try {
                serialize();
            } catch (IOException ex1) {
                Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
            try {
                serialize();
            } catch (IOException ex1) {
                Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
            try {
                serialize();
            } catch (IOException ex1) {
                Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     * @throws java.io.IOException
     */
    public void setUser(User user) throws IOException {
        this.user = user;
        this.lastLogin = LocalDateTime.now();
        serialize();

    }

    /**
     * @return the lastLogin
     */
    private LocalDateTime getLastLogin() {
        return lastLogin;
    }

}
