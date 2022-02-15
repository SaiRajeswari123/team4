package TestCases_new;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base1Package.Base1;
import ScrollLevel.ScrollOperation;
//import SearchLevel.LocateElement;

public class TestCase_003 extends Base1{
	
	public ScrollOperation sp;
	//Step 1
		public TestCase_003() throws IOException {
			super();
		}
		//Step2
		
		@BeforeMethod
		public void SetUp1() throws IOException, InterruptedException {
			
			//initialization();
		    sp=new ScrollOperation();	
		}
		@Test
		public void  scrollTo() throws IOException
		{
			sp.scrollToBottom();;
	  
		     
		}
	
}
