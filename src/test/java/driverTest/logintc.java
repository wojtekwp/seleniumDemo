package driverTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintc {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
		 driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.id("submit")).click();
		
		String msg=driver.findElement(By.className("post-title")).getText();
		if(msg.contains("Logged In Successfully"))
			System.out.println("Log in successfull");
		}
		catch(Exception e)
		{   File ss=   ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(ss,new File("C:\\junitws\\ScreenShotjan.jpg"));
			System.out.println("Log in unsuccessfull");
		}
		//*[@id="password"]
	}

}
