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
/**
 *
 * @author Raul Farkas
 */
public class Session implements Serializable {
    public User user;
    public LocalDateTime lastLogin;

    
    public void serialize() throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream("/data/session.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this.user);
        out.writeObject(this.lastLogin);
        
        out.close();
        fileOut.close();
    }

    public void deserialize() throws FileNotFoundException, IOException, ClassNotFoundException, SessionExpiredException {
        FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        this.user = (User)in.readObject();
        this.lastLogin = (LocalDateTime)in.readObject();
        //Set it to null if 
        if(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)>this.lastLogin.toEpochSecond(ZoneOffset.UTC) + 172800){
            this.user = null;
            this.lastLogin = null;
            throw new SessionExpiredException("Session has expired!");
        }
        in.close();
        fileIn.close();

    }
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
        this.lastLogin = LocalDateTime.now();
        
    }

    /**
     * @return the lastLogin
     */
    private LocalDateTime getLastLogin() {
        return lastLogin;
    }
    
    
    
    

    
}
