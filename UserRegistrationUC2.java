/**
 * @Author Aniruddha
 * @since 29Jun2021
 * As a User need to enter a valid Last Name.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC2 {
    static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter First Name:");
        String name= s.next();
        System.out.println("Enter Last Name:");
        String lastname=s.next();
        if(name == null || name.isEmpty() && lastname == null || lastname.isEmpty()){
            System.out.println("Invalid");
        }
        String nameregex = "^[A-Z][a-z]{2}";
        String lastnameregex = "^[A-Z][a-z]{2}";
        Pattern pattern =Pattern.compile(nameregex);
        Pattern pattern1= Pattern.compile(lastnameregex);

        if(pattern.matcher(name).matches() && pattern1.matcher(lastname).matches()){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Invalid Name");
        }
    }
}
