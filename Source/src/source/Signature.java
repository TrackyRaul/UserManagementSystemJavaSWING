package source;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Raul Farkas
 */
public class Signature implements Serializable{
    private User user;
    private LocalDateTime dateTime;
    
    /**
     *
     * @param user
     * @param dateTime
     */
    public Signature(User user, LocalDateTime dateTime){
        this.user = user;
        this.dateTime = dateTime;
        
        
        
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @return the dateTime
     */
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
    
    
    
}
