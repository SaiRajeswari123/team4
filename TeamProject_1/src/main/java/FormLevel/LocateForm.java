package FormLevel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base1Package.Base1;

public class LocateForm  extends Base1
{
	
		@FindBy(xpath = "//input[@class= 'input']")

		WebElement name;

		@FindBy(xpath = "/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[1]/div/div[2]/form/p[2]/textarea")

		WebElement message;

		@FindBy(xpath = "//button[@type= 'submit']")

		WebElement submitbtn;
		
		public LocateForm() throws IOException {
		    PageFactory.initElements(driver, this);
		    }
		
		public void form22(String namee, String msg) throws IOException, InterruptedException{
	      
	    	name.sendKeys(namee);
	    	message.sendKeys(msg);
	    	submitbtn.click();
	    	Thread.sleep(20000);
	    	driver.navigate().back();	
	    	
//	    	String link1xpath = prop.getProperty("link1");
//			driver.findElement(By.linkText(link1xpath)).click();
}
}
