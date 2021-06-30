/**
 * @Author Aniruddha
 * @since 29Jun2021
 * Should clear all email samples provided separately.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationUC9 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter First Name:");
        String name= s.next();
        System.out.println("Enter Last Name:");
        String lastname=s.next();
        System.out.println("Enter Email:");
        String email=s.next();
        System.out.println("Enter Phone Number:");
        String phonenumber= s.next();
        System.out.println("Enter Password:");
        String password= s.next();
        System.out.println("Enter another Email:");
        String email1= s.next();
        if(name == null || name.isEmpty() && lastname == null || lastname.isEmpty() && email == null || email.isEmpty() && phonenumber == null || phonenumber.isEmpty() && password == null || password.isEmpty() && email1 == null || email1.isEmpty()){
            System.out.println("Invalid");
        }
        String nameregex = "^[A-Z][a-z]{2,}";
        String lastnameregex = "^[A-Z][a-z]{2,}";
        String emailregex = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
        String phonenumregex= "^([+]\\d{2}[\s])?\\d{10}$";
        String passwordregex= "^(?=.*[A-Z])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[0-9]).{8,}$";
        String email1regex= "^[a-zA-z0-9.+_-]{2,}@[a-zA-z0-9]{1,}[.]{1}[a-z]{2,}$";
        Pattern pattern =Pattern.compile(nameregex);
        Pattern pattern1 = Pattern.compile(lastnameregex);
        Pattern pattern2 = Pattern.compile(emailregex);
        Pattern pattern3 = Pattern.compile(phonenumregex);
        Pattern pattern4 = Pattern.compile(passwordregex);
        Pattern pattern5 = Pattern.compile(email1regex);

        if(pattern.matcher(name).matches() && pattern1.matcher(lastname).matches())  {
            System.out.println("Valid Name");
        }
        if(pattern2.matcher(email).matches()){
            System.out.println("Valid Email");
        }
        if(pattern3.matcher(phonenumber).matches()){
            System.out.println("Valid Phone Number");
        }
        if(pattern4.matcher(password).matches()){
            System.out.println("Valid Password");
        }
        if(pattern5.matcher(email1).matches()){
            System.out.println("Valid Email1");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
