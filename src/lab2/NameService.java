package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private int LAST_NAME_IDX = 1;
   private String lastName = "Unknown"; 
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{
         
        if (fullName == null || fullName.isEmpty() ||
                fullName.length()<3 || fullName.length() > 6) {
            throw new IllegalArgumentException(
                    "Sorry first name is mandatory and must be between 3  and 15 characters in length");
        } 
        
        String[] name = fullName.split(" ");
        lastName = name[LAST_NAME_IDX ];
        
        // write your code here to extract the lastName and store in the
        // above local variable
        
        return lastName;
    }
    

    
    
}
