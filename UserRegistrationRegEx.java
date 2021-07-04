import java.util.regex.Pattern;

public class UserRegistrationRegEx {
	 private static final String NAME = "[A-Z][a-z]{2,}";
	    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
	    private static final String PHONE_NUMBER =  "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
	    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[0-9]).{8,}$";
        String message;
        
        public UserRegistrationRegEx(String message)
        {
        	this.message=message;
        }
        
	    public UserRegistrationRegEx() {
			
		}

		public boolean firstNameValidate(String firstName) {
	        return Pattern.matches(NAME, firstName);
	    }

	    public boolean lastNameValidate(String lastName) {
	        return Pattern.matches(NAME, lastName);
	    }

	    public boolean emailValidate(String email) {
	        return Pattern.matches(EMAIL, email);
	    }

	    public boolean phoneNumberValidate(String phNum) {
	        return Pattern.matches(PHONE_NUMBER, phNum);
	    }

	    public boolean passwordValidate(String password) {
	        return Pattern.matches(PASSWORD, password);
	    }

	    public String analyseMood() {
	        if (message.contains("sad") || message.contains("SAD") ) {
	            return "SAD";
	        } else {
	            return "HAPPY";
	        }
	    }
	    
	    public String analyseMood1() {
	        if (message.contains("happy") || message.contains("HAPPY") ) {
	            return "HAPPY";
	        } else {
	            return "SAD";
	        }
	    }
}