package driverTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
       WebElement we=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
       Select s=new Select(we);
       s.selectByIndex(4);
       List<WebElement> l=s.getOptions();
       System.out.println("total countries "+l.size());
	}

}
