package sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginpage {
	
	WebDriver driver;
	
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	 
	public void radio() {
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
	}

	public void suggestionbox() {
		try {
			driver.findElement(By.id("autocomplete")).sendKeys("ind");
			List <WebElement> ele=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
			for(WebElement value:ele) {
				if(value.getText().equalsIgnoreCase("India")) 
				{
					value.click();
					break;
				}
			}	
		}
		catch(Exception e){
			System.out.println("Not able to find element");
		}
	}
	
	public void check_box() {
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.linkText("Contact info")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		loginpage obj=new loginpage();
		obj.launch();
		obj.radio();
		obj.suggestionbox();
		obj.check_box();

	}

}
