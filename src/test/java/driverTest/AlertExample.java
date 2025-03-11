package driverTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
   driver.get("https://vinothqaacademy.com/alert-and-popup/");
   driver.manage().window().maximize();
   String title=driver.getTitle();
   System.out.println(title);
   driver.findElement(By.name("alertbox")).click();
   Alert a =driver.switchTo().alert();
   System.out.println(a.getText());
   a.accept();
   driver.navigate().to("https://www.google.com/");
   driver.navigate().back();
   driver.navigate().forward();
  
   //a.dismiss(); //to cancel
   //a.sendKeys(keysToSend); //to enter value
	}

}
