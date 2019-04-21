
package source;

import java.io.Serializable;

/**
 *
 * @author Raul Farkas
 */
public class Admin extends User implements Serializable {
    
    public Admin(String username, String password, String email) {
        super(username, password, email);
        this.blocked = false;
    }
}
