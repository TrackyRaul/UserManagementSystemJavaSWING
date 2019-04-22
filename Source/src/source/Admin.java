
package source;

import java.io.Serializable;

/**
 *
 * @author Raul Farkas
 */
public class Admin extends User implements Serializable {
    
    /**
     * Constructor
     *
     * @param username
     * @param password
     * @param email
     */
    public Admin(String username, String password, String email) {
        super(username, password, email);
        super.setBlocked(false);
    }
}
