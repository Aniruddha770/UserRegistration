import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTesting {

	  @Test
	    public void givenFirstName_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.firstNameValidate("Prathamesh");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.firstNameValidate("pratham");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenLastName_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.lastNameValidate("Tibile");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenLastName_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.lastNameValidate("Ti");
	        Assert.assertFalse(result);
	    }


	    @Test
	    public void givenEmail_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenEmail_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPhone_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("+91-9863632323");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPhone_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("98323723");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPassword_whenProper_ShouldReturnTrue() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.passwordValidate("Pass@123456");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPassword_whenNotProper_ShouldReturnFalse() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
	        boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
	        Assert.assertFalse(result);
	    }
	    
	    @Test
	    public void givenIAmInSadMood_shouldReturnSad() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx("I am in SAD mood");
	        String mood = userRegistrationRegEx.analyseMood();
	        Assert.assertEquals(mood,"SAD");
	    }
	    @Test
	    public void givenIAmInHappyMood_shouldReturnHappy() {
	        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx("I am in HAPPY mood");
	        String mood = userRegistrationRegEx.analyseMood1();
	        Assert.assertEquals(mood,"HAPPY");
	    }
	    
}