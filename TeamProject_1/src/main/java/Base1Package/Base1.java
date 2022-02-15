package Base1Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import FormLevel.LocateForm;

public class Base1 {
	public static WebDriver driver;
	public static Properties prop;

	public Base1() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("./Configuration\\Config.properties");
		prop.load(fis);
	}

	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browserName");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		String fakexpath = prop.getProperty("fakeurl");
		driver.findElement(By.linkText(fakexpath)).click();
		Thread.sleep(2000);
		String buttonxpath = prop.getProperty("button");
		driver.findElement(By.xpath(buttonxpath)).click();

	}

	public static void navigation() {
		driver.navigate().back();
		driver.navigate().back();
		String link1xpath = prop.getProperty("link1");
		driver.findElement(By.linkText(link1xpath)).click();
		
		
}

	//public static void navigation1() {
	//	driver.navigate().back();
	//	String linkxpath = prop.getProperty("link");
	//driver.findElement(By.linkText(linkxpath)).click();
	//}

}
