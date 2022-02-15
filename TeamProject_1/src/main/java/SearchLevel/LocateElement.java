package SearchLevel;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base1Package.Base1;

public class LocateElement extends Base1 {

	@FindBy(xpath = "//button[@class= 'et_pb_menu__icon et_pb_menu__search-button']")
	WebElement search_btn;

	@FindBy(xpath = "//input[@class='et_pb_menu__search-input']")
	WebElement searchField;
	
	// Initializing the Page Objects:
	public LocateElement() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void loginsearch(String name) throws IOException {

		search_btn.click();
		searchField.sendKeys(name);
		searchField.sendKeys(Keys.chord(Keys.ENTER));
		navigation();
		
	}
}
