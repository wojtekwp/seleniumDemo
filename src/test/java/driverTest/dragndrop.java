package driverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		WebElement framen=driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(framen);
		WebElement src=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/h5"));
		WebElement dest=driver.findElement(By.id("trash"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).build().perform();
		
		
	}

}
