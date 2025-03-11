package driverTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.pageObjectLogin;
public class testPom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		pageObjectLogin pol=new pageObjectLogin(driver);
		pol.login("student","Password123");
		
	}

}
