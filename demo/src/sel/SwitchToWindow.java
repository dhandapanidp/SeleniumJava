package sel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();

				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			    WebElement ele=driver.findElement(By.xpath("//legend[@class=\"switch-tab\"]"));
			    String value=ele.getText();
			    System.out.println(value);
			    
			    
			    String parentTab=driver.getWindowHandle();
			    System.out.println(parentTab);
			    driver.findElement(By.id("opentab")).click();
			    Set<String> getwindow=driver.getWindowHandles();
			    for(String newwindow:getwindow) {
			    	if(newwindow!=parentTab) {
			    		driver.switchTo().window(newwindow);
			    	}
			    }
			    driver.findElement(By.xpath("//a[@class=\"active\"]")).click();
			    String newTab=driver.getWindowHandle();
			    System.out.println(newTab);
			    driver.close();
				
				
	}

}
