package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) throws IllegalArgumentException{
        
    try {    
        Employee emp = new Employee("Jim","Smith","3333333333",28);
        
        // Think about this code. It wouldn't work if lastName was null
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        System.out.println(fullNameInCaps);
        }
    catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
        
    }
}
