/**
 * @author Aniruddha
 * @since 29Jun2021
 * As a User need to enter a valid First Name
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResgistarionUC1 {
 static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        // Taking Input from User
        System.out.println("Enter Name:");
        String name= s.next();
        if(name == null || name.isEmpty()){
            System.out.println("Invalid");
        }
        // Regex Pattern
        String nameregex = "^[A-Z][a-z]{2}";

        // Checking the Pattern with Input
        Pattern pattern =Pattern.compile(nameregex);
        if(pattern.matcher(name).matches()){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Invalid Name");
        }
    }


}
