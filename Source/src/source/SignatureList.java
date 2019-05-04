package source;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Farkas
 */
public class SignatureList {

    /**
     *
     */
    public ArrayList<Signature> list;

    /**
     *
     */
    public SignatureList() {
        list = new ArrayList();
        deserialize();

    }

    /**
     *
     * @param user
     * @throws IOException
     * @throws UserAlreadySignedException
     */
    public void signNow(User user) throws IOException, UserAlreadySignedException {
        for (Signature s : getList()) {
            if (s.getDateTime().toEpochSecond(ZoneOffset.UTC) > LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) - 86400 && s.getUser().getUsername().equals(user.getUsername())) {
                throw new UserAlreadySignedException("User already signed!");

            }
        }
        LocalDateTime now = LocalDateTime.now();
        getList().add(new Signature(user, now));
        serialize();

    }

    /**
     *
     * @param username
     * @return
     */
    public Signature getByUserToday(String username) {
        Signature ret = null;
        for (Signature s : getList()) {
            if (s.getDateTime().toEpochSecond(ZoneOffset.UTC) > LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) - 86400 && s.getUser().getUsername().equals(username)) {
                ret = s;
                break;
            }

        }

        return ret;

    }
    
    /**
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void serialize() throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream("./data/signatures.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this.getList());
        out.close();
        fileOut.close();
    }

    /**
     *
     */
    public void deserialize() {
        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("./data/signatures.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.list = (ArrayList<Signature>) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
            try {
                serialize();
            } catch (IOException ex1) {
                Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the list
     */
    public ArrayList<Signature> getList() {
        return list;
    }

}
