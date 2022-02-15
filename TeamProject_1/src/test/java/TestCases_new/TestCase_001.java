package TestCases_new;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base1Package.Base1;
//import FormLevel.LocateForm;
//import HomeLevel.LoginPageNew;

import SearchLevel.LocateElement;

public class TestCase_001 extends Base1{
	public LocateElement le;

	//Step 1
	public TestCase_001() throws IOException {
		super();
	}
	//Step2
	
	@BeforeMethod
	public void SSetUp() throws IOException, InterruptedException {
		
		initialization();
	    le=new LocateElement();	
	}
	@Test
	public void validatesearch() throws IOException
	{
		le.loginsearch(prop.getProperty("name"));
	     
	}
	
	

}
		
