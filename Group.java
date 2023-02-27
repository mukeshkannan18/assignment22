package project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group {
	public static void main(String[] args) throws InterruptedException {
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
	WebElement group=driver.findElement(By.xpath("(//label[@class='radio-label'])[2]"));
	group.click();
	
	
	WebElement help=driver.findElement(By.id("lookup.IO:aefb68015f212100a9ad2572f2b47702"));
	help.click();

	Set<String> window = driver.getWindowHandles();
	List<String>window2=new ArrayList<>(window);
	driver.switchTo().window(window2.get(1));
		
	
	WebElement analyst=driver.findElement(By.linkText("App Engine Studio Users"));
	analyst.click();
	
	driver.switchTo().window(window2.get(0));
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("submit_button")).click();
			
	
	
	

}}
