package ScrollLevel;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base1Package.Base1;

public class ScrollOperation extends Base1{
	public static WebDriver driver;
	
     @FindBy(xpath="//*[@id=\"main-content\"]/div/div/section/div/ul/li[2]/a/div")
	 WebElement course;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div/article/section[2]/a")
	 WebElement signup;
	
        // Initializing the Page Objects:
		public ScrollOperation() throws IOException {
			PageFactory.initElements(driver, this);
		}
	
	public void scrollToBottom() {
	    course.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        signup.click();
    }
}
