package sel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  String parent=driver.getWindowHandle();
	  driver.findElement(By.id("openwindow")).click();
	  Set<String> allwindow=driver.getWindowHandles();
	  for(String window:allwindow) {
		  
		  if(window!=parent) {
			  driver.switchTo().window(window);
			  
		  }
	  }
	  driver.findElement(By.xpath("//a[@class=\"main-btn\"]")).click();
	  
	}

}
