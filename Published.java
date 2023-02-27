package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Published {
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
		inc.sendKeys("Articles");
		
		WebElement art=driver.findElement(By.xpath("(//div[text()='Published'])"));
		art.click();
		
		driver.switchTo().frame(0);
		WebElement neew=driver.findElement(By.xpath("//button[text()='New']"));
		neew.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		WebElement name=driver.findElement(By.xpath("//div[@class='input-group ref-container']/input"));
		name.sendKeys("it",Keys.TAB);
		
		WebElement name1=driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']"));
		name1.sendKeys("testleaf");
		
		WebElement name2=driver.findElement(By.xpath("(//button[text()='Submit'])[2]"));
		name2.click();
	}
}
