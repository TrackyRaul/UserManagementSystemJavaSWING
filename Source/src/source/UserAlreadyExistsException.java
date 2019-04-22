/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author raul
 */
public class UserAlreadyExistsException extends Exception {

    /**
     *
     * @param string
     */
    public UserAlreadyExistsException(String string) {
        super(string);
    }
    
}
