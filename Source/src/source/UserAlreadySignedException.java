package source;

/**
 *
 * @author Raul Farkas
 */
public class UserAlreadySignedException extends Exception{
    
    /**
     *
     * @param string
     */
    public UserAlreadySignedException(String string){
        super(string);
    }
}
