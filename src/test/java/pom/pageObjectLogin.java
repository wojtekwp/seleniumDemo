package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pageObjectLogin {
	WebDriver driver;
	public pageObjectLogin(WebDriver driver)
	{
	  this.driver=driver;	
		
	 }
	
By uname=By.name("username");
By pwd=By.name("password");
By btn=By.id("submit");

public void login(String user,String pass)
{
	driver.findElement(uname).sendKeys(user);
	driver.findElement(pwd).sendKeys(pass);
	driver.findElement(btn).click();

}


}
