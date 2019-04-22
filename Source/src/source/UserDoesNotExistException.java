/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author Raul Farkas
 */
public class UserDoesNotExistException extends Exception{

    /**
     *
     * @param string
     */
    public UserDoesNotExistException(String string) {
        super(string);
    }
    
}
