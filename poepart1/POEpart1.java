
package poepart1;
import java.util.Scanner;



public class POEpart1 
{
    //FOR USERNAME
     // Function to check if the username is valid
    public static boolean isValidUsername(String username) 
    {
        // Check if the username contains an underscore
        boolean hasUnderscore = username.contains("_");
        // Check if the username is no more than five characters long
        boolean isLengthValid = username.length() <= 5;
        // The username is valid only if both conditions are true
        return hasUnderscore && isLengthValid;
    }
    
    //FOR PASSWORD
    //Function to check if password is valid
    public static boolean isValidpassword(String password)
    {
        //check is contains 8 characters
        boolean hasEightchar = password.length() >=8;
        //check if has number
        boolean hasNumber = password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || 
                     password.contains("4") || password.contains("5") || password.contains("6") || 
                     password.contains("7") || password.contains("8") || password.contains("9");

        //Check if it has capital letter
        boolean hasCapitalletter =  password.contains("A") || password.contains("B") || password.contains("C") || password.contains("D") || 
                     password.contains("E") || password.contains("F") || password.contains("G") || 
                     password.contains("H") || password.contains("I") || password.contains("J") || password.contains("K") || password.contains("L") || password.contains("M") || password.contains("N") || 
                     password.contains("O") || password.contains("P") || password.contains("Q") || 
                     password.contains("R") || password.contains("S") || password.contains("T") || password.contains("U") || password.contains("V") || password.contains("W") || 
                     password.contains("X") || password.contains("Y") || password.contains("Z")  ;

        //check if it has special characters
        boolean hasSpecialchar = password.contains(">") || password.contains("~") || password.contains("`") || password.contains("!") || 
                     password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || 
                     password.contains("*") || password.contains("_") || password.contains("+") || password.contains("-") ;
        //username will passif  all 4 are there
        return hasEightchar && hasNumber && hasCapitalletter && hasSpecialchar;
    }
    
    //FOR CELLPHONE NUMBER
    //Function to check if cellno is valid
    public static boolean isValidcellno(String cellno)
    {
        
        // The "||" represents "or" unlike (1,2,3,4....,0)
        boolean hasnumbers = cellno.contains("0") || cellno.contains("1") || 
           cellno.contains("2") || cellno.contains("3") || cellno.contains("4") ||
              cellno.contains("5") || cellno.contains("6") || 
           cellno.contains("7") || cellno.contains("8") || cellno.contains("9");

        boolean hasSAcode = cellno.contains("+27");
        return hasSAcode && hasnumbers;
  }

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("Please enter your name and surname: ");
        String nameandsurname = scanner.nextLine();
        
        
        
        int whileStopper = 1;
        
        // Get user input
        while(whileStopper != 0)
        {
            System.out.println("\n-----Registration Process-----");
            
            System.out.println("Enter Username (user name must consist of maximum of "
                     + "5 characters with a underscore): ");
            String username = scanner.nextLine();
            
            System.out.println("Enter your password (password should contain a capital "
                     + "letter, at least 8 characters,"
                     + "contains a number and a special character): ");
            String password = scanner.nextLine();
            
            System.out.println("Enter your South African cell phone number"
                    + " (cellphone number should have international country code): ");
            String cellno = scanner.nextLine();
        
    
            // DISPLAY USERNAME VALIDATION MESSAGE
            boolean isUsernameValid = isValidUsername(username);
            if (isUsernameValid ) 
            {
                System.out.println("\nUsername successfully captured.");
            } 
            else 
            {
                System.out.println("\nUsername is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            }


            //DISPLAY PASSWORD VALIDATION MESSAGE
            boolean isPasswordvalid = isValidpassword(password);
            if (isPasswordvalid) 
            {
                System.out.println("Password successfully captured.");
            } 
            else 
            {
                System.out.println("Password is not correctly formated, please"
                    + " ensure that your password contains at least eight characters"
                    + ", a capital letter, a number and a special charecter.");
            }

           //DISPLAY CELLNO VALIDATION MESSAGE
           boolean isCellnoValid = isValidcellno(cellno);
           if(isCellnoValid == true)
           {
                System.out.println("Cell phone number successfully captured.");
           }
           else
           { 
                System.out.println("Cell phone number incorrectly formated or"
                        + " does not contain international code.");
           }

           //if statement for successful 
           if( isCellnoValid == true && isPasswordvalid == true && isUsernameValid == true )
           {
                System.out.println("\nYOU HAVE SUCCESSFULLY REGISTERED!");
                
                int whileStopper2 = 1;
                
                while(whileStopper2 != 0)
                {
                    //LOGING IN 
                    System.out.println("\n------Login------");

                    //put in their username
                    System.out.println("Please enter your username: ");
                    String usernameLog = scanner.nextLine();

                    //put in their password
                    System.out.println("Please enter your password: ");
                    String passwordLog = scanner.nextLine();

                    //if statement for login
                    if(usernameLog.equals(username) && passwordLog.equals(password))
                    {

                        System.out.println("Welcome" + " " + nameandsurname +
                                ", it is great to see you again.");
                        whileStopper = 0;
                        whileStopper2 = 0;
                    } 
                    else 
                    {    
                        System.out.println("Username or password is incorrect"
                                + ", please try again");
                    }
                }
            } 
        }
        scanner.close();
    }
}
  
    


