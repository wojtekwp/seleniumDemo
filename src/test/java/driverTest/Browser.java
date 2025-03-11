package driverTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		Scanner option=new Scanner(System.in);
		System.out.println("Select the Browser 1.Chrome 2.Edge 3.Firefox");
		int s=option.nextInt();
		if(s==1)
         driver=new ChromeDriver();
		else if(s==2)
		 driver=new EdgeDriver();
		else if(s==3)
		 driver=new FirefoxDriver();
		else
			System.out.println("Invalid input");
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("APjFqb")).sendKeys("download disabled in eclipse");
    driver.findElement(By.name("btnK")).click();
    //driver.close();
   // driver.quit();
	}

}
