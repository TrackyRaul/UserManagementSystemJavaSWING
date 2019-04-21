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

    ArrayList<User> users;

    public UsersList() {
        users = new ArrayList();
        try {
            deserialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public User login(String username, String password) {
        User usr = null;
        for (User user : this.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                usr = user;
            }
        }
        return usr;
    }

    public void Register(String username, String email, String password) {

        if (!doesUserExist(username)) {
            User newUser = new User(username, email, password);
            users.add(newUser);
        }
        try {
            serialize();
        } catch (IOException ex) {
            Logger.getLogger(UsersList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

    public boolean doesUserExist(String username) {
        boolean ret = false;
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                ret = true;
            }
        }

        return ret;

    }

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

    public void serialize() throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream("/data/users.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this.users);
        out.close();
        fileOut.close();
    }

    public void deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        this.users = (ArrayList<User>) in.readObject();
        in.close();
        fileIn.close();

    }
}
