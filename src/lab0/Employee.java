package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    //vacation days need to be greater than 0 and nomore than 60
    public void setDaysVacation(int daysVacation)throws IllegalArgumentException{
        if (daysVacation >0 || daysVacation < 60){
            throw new IllegalArgumentException(
                    "Sorry vacation days need to be between 1 and 60");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    //Needs to have atleast 3 characters and nomore than 15, cannot be null or empty. 
    public final void setFirstName(String firstName) throws IllegalArgumentException{
        if (firstName == null || firstName.isEmpty() ||
                firstName.length()<3 || firstName.length() > 6) {
            throw new IllegalArgumentException(
                    "Sorry first name is mandatory and must be between 3  and 15 characters in length");
        }
       
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    // //Needs to have atleast 3 characters and nomore than 15, cannot be null or empty. 
    public void setLastName(String lastName) throws IllegalArgumentException{
        if (lastName == null || lastName.isEmpty() ||
                lastName.length()<3 || lastName.length() > 6) {
            throw new IllegalArgumentException(
                    "Sorry last name is mandatory and must be between 3  and 15 characters in length");
        }
       
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
