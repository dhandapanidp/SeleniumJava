package sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.get("https://practice.expandtesting.com/drag-and-drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		Actions action=new Actions(driver);
		WebElement ele1=driver.findElement(By.id("column-a"));
		WebElement ele2=driver.findElement(By.id("column-b"));
		
		action.dragAndDrop(ele1, ele2).perform();
		
	/*  Actions action= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
		action.doubleClick(ele).perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		action.contextClick(ele).perform();    */
	}

}
