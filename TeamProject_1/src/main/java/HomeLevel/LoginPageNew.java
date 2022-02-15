package HomeLevel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base1Package.Base1;
import FormLevel.LocateForm;

public class LoginPageNew extends Base1 {
	public LocateForm locform;
		
	    @FindBy(xpath="//*[@id=\"user[email]\"]")
		WebElement username;
		
		@FindBy(xpath="//*[@id=\"user[password]\"]")
		WebElement password;
		
		@FindBy(xpath="//input[@value=\"Sign in\"]")
		WebElement submitbtn;
		

		//Initializing the Page Objects:
		public  LoginPageNew() throws IOException {
		PageFactory.initElements(driver, this);
		}
	
	//Action - validate Login and action on Elements
		public void login22(String name, String pwd) throws IOException, InterruptedException{
		
			username.sendKeys(name);
			password.sendKeys(pwd);
			submitbtn.click();
			driver.navigate().back();
			String linkxpath = prop.getProperty("link");
			driver.findElement(By.linkText(linkxpath)).click();
			//locform.form22(prop.getProperty("name"), prop.getProperty("message"));
			//return new HomePage();
			
		}

}
