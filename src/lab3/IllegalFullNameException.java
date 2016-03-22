/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Emilio
 */
public class IllegalFullNameException 
    extends IllegalArgumentException { 

    private static final String ERR_MSG = "Sorry full name must consist of first name and last name";
    
    
    public IllegalFullNameException() {
    }

    public IllegalFullNameException(String s) {
        super(ERR_MSG);
    }

    public IllegalFullNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalFullNameException(Throwable cause) {
        super(cause);
    }
    
    
}
