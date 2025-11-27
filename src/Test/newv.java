package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newv {

	
	@BeforeMethod
	public void d() {

	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement check=d.findElement(By.id("checkBoxOption1"));
		check.click();
		Thread.sleep(2000);
		System.out.println(check.isSelected());
		check.click();
		Thread.sleep(2000);
		System.out.println(check.isSelected());
		
		
		List<WebElement> all=d.findElements(By.xpath("//div[@class='right-align']/fieldset/label"));
		System.out.println(all.size());
	
		
	}}


