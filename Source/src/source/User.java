package source;

import java.io.Serializable;

/**
 *
 * @author Raul Farkas
 */
public class User implements Serializable  {
    private String username;
    private String password;
    private String email;
    private boolean blocked;
    private String description;
    
    /**
     *
     */
    public User(){
        
    }

    /**
     * Constructor
     *
     * @param username
     * @param email
     * @param password
     */
    public User(String username, String email,String password) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.blocked = false;
    }
    
    /**
     * Copy constructor
     *
     * @param usr
     */
    public User(User usr){
        this.username = usr.getUsername();
        this.password = usr.getPassword();
        this.email = usr.getEmail();
        this.blocked = usr.isBlocked();
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the blocked
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * @param blocked the blocked to set
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    
    
    
    
    
}
