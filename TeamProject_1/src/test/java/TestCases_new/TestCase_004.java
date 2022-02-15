package TestCases_new;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base1Package.Base1;
import FormLevel.LocateForm;
import HomeLevel.LoginPageNew;
public class TestCase_004 extends Base1{
	public LocateForm lb;
	public LoginPageNew lp1;
	
		public TestCase_004() throws IOException {
			super();
			
		}
		
	    @BeforeMethod
	    public void SSSetUp() throws IOException, InterruptedException {
	      
	       // initialization();
	       
	        lb=new LocateForm();   
	    }
	    @Test
	    public void validateForm() throws IOException
	    {
	    		   lb.form22(prop.getProperty("fname"), prop.getProperty("message"));

	    }
}
