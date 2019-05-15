package source;

import java.io.Serializable;

/**
 *
 * @author Raul Farkas
 */
public class User implements Serializable {

    private String username;
    private String name;
    private String surname;
    private String password;
    private String email;
    private boolean blocked;
    private String description;

    /**
     *
     */
    public String role;

    /**
     *
     */
    public User() {

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" + "username=" + username + ", name=" + name + ", surname=" + surname + ", password=" + password + ", email=" + email + ", blocked=" + blocked + ", description=" + description + ", role=" + role + '}';
    }

    
    
    

    /**
     * Constructor
     *
     * @param username
     * @param email
     * @param password
     */
    public User(String username, String email, String password) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.blocked = false;
        this.role = "";
        this.description = "";
    }

    /**
     *
     * @param usr
     */
    public User(User usr) {
        this.username = usr.getUsername();
        this.name = usr.getName();
        this.surname = usr.getSurname();
        this.password = usr.getPassword();
        this.email = usr.getEmail();
        this.blocked = usr.isBlocked();
        this.description = usr.getDescription();
        this.role = usr.getRole();
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
    
    
    
    
    
}
