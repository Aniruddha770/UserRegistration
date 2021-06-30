/**
 * @Author Aniruddha
 * @since 29Jun2021
 * As a User need to enter a valid Phone Number.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC4 {
    static Scanner s= new Scanner(System.in);
    // Taking Input from User
    public static void main(String[] args) {
        System.out.println("Enter First Name:");
        String name= s.next();
        System.out.println("Enter Last Name:");
        String lastname=s.next();
        System.out.println("Enter Email:");
        String email=s.next();
        System.out.println("Enter Phone Number:");
        String phonenumber= s.next();
        if(name == null || name.isEmpty() && lastname == null || lastname.isEmpty() && email == null || email.isEmpty() && phonenumber == null || phonenumber.isEmpty()){
            System.out.println("Invalid");
        }

        //Regex patterns
        String nameregex = "^[A-Z][a-z]{2,}";
        String lastnameregex = "^[A-Z][a-z]{2,}";
        String emailregex = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
        String phonenumregex= "^([+]\\d{2}[\s])?\\d{10}$";
        Pattern pattern =Pattern.compile(nameregex);
        Pattern pattern1 = Pattern.compile(lastnameregex);
        Pattern pattern2 = Pattern.compile(emailregex);
        Pattern pattern3 = Pattern.compile(phonenumregex);

              // Checking Patterns with Inputs
        if(pattern.matcher(name).matches() && pattern1.matcher(lastname).matches())  {
            System.out.println("Valid Name");
        }
        if(pattern2.matcher(email).matches()){
            System.out.println("Valid Email");
        }
        if(pattern3.matcher(phonenumber).matches()){
            System.out.println("Valid Phone Number");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
