package source;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Farkas
 */
public class UsersList implements Serializable {

    private ArrayList<User> users;

    /**
     * Constructor
     *
     */
    public UsersList() {
        users = new ArrayList();
        deserialize();

    }

    /**
     * Login if user exists
     *
     * @param username
     * @param password
     * @return
     * @throws UserDoesNotExistException
     */
    public User login(String username, String password) throws UserDoesNotExistException {
        User usr = null;
        for (User user : this.users) {

            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                usr = user;
                break;
            }
        }
        if (usr == null) {
            throw new UserDoesNotExistException("User does not exist or wrong password!");
        }
        return usr;
    }

    /**
     * Register if user not already registered
     *
     * @param username
     * @param email
     * @param password
     * @throws UserAlreadyExistsException
     */
    public void Register(String username, String email, String password) throws UserAlreadyExistsException {
        
        User newUser = null;
        if (!doesUserExist(username)) {
            if (username.contains("admin")) {
                newUser = new Admin(username, email, password);
            } else {
                newUser = new User(username, email, password);
            }
            users.add(newUser);
        } else {
            throw new UserAlreadyExistsException("A user with the same username is already registered!");
        }
        try {
            serialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Remove user if exists
     *
     * @param username
     */
    public void removeUser(String username) {
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                this.users.remove(user);
            }
        }
        try {
            serialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Check if user exists
     *
     * @param username
     * @return
     */
    public boolean doesUserExist(String username) {
        boolean ret = false;
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                ret = true;
            }
        }

        return ret;

    }

    /**
     * Block user
     *
     * @param username
     */
    public void block(String username) {
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                user.setBlocked(true);
            }

        }
        try {
            serialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Unblock user
     *
     * @param username
     */
    public void unBlock(String username) {
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                user.setBlocked(false);
            }

        }
        try {
            serialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void updateUser(User user){
        for(int i = 0; i<users.size();i++){
            if(users.get(i).getUsername().equals(user.getUsername())){
                users.set(i, user);
            }
        }
        try {
            serialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Serialize
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void serialize() throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream("./data/users.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this.users);
        out.close();
        fileOut.close();
    }

    /**
     * Deserialize
     *
     */
    public void deserialize() {
        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("./data/users.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.users = (ArrayList<User>) in.readObject();
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
}
