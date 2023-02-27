package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceCategory {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		WebElement uname=driver.findElement(By.id("user_name"));
		uname.sendKeys("admin");
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.sendKeys("P-qQ7@umSYz8");
		WebElement Button=driver.findElement(By.id("sysverb_login"));
		Button.click();
		driver.switchTo().defaultContent();
		WebElement inc=driver.findElement(By.id("filter"));
		inc.sendKeys("service cate");
		WebElement service=driver.findElement(By.xpath("//div[text()='My Service Categories']"));
		service.click();
		driver.switchTo().frame(0);
		WebElement neew=driver.findElement(By.xpath("//button[text()='New']"));
		neew.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement fi=driver.findElement(By.xpath("(//div[@class='input-group']/input)[1]"));
		fi.clear();
		fi.sendKeys("Customer Sup");
		WebElement cn=driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']"));
		cn.sendKeys("customer");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement submit=driver.findElement(By.xpath("//span[text()='Submit']"));
		submit.click();
		
		
		
		
		
		
		
		
		
	}

}
