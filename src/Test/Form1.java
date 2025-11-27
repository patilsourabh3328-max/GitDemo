package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form1 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.get("https://demo.automationtesting.in/Register.html");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("name");
	d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("username");
		
	d.findElement(By.xpath("//div[@class='form-group']/div/textarea")).sendKeys("Address");
	d.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
	
	d.findElement(By.xpath("//input[@type='tel']")).sendKeys("7276950096");
	
	d.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	
	d.findElement(By.id("checkbox1")).click();
	
	
	d.findElement(By.id("msdd")).click();
	
	List<WebElement>all=d.findElements(By.xpath("//li[@class='ng-scope']/a"));
	for(WebElement single:all) {
		String child=single.getText();
		if(child.equals("Hindi")|| child.equals("Dutch")) {
			single.click();
		}
	
	}
	
	WebElement skill=d.findElement(By.id("Skills"));
	Select s=new Select(skill);
	s.selectByIndex(3);
	
	d.findElement(By.xpath(" //span[@role='combobox']")).click();
	List<WebElement>sp=d.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
	for(WebElement single2:sp) {
		String a=single2.getText();
		if(a.equals("India")) {
			single2.click();
			break;
		}
	}
	Thread.sleep(200);
	
	WebElement year=d.findElement(By.id("yearbox"));
	year.click();
	Select p=new Select(year);
	p.selectByVisibleText("1996");
	
	
	WebElement month=d.findElement(By.xpath("//select[@placeholder='Month']"));
	month.click();
	Select p1=new Select(month);
	p1.selectByVisibleText("June");
	
	WebElement day=d.findElement(By.xpath("//select[@placeholder='Day']"));
	day.click();
	Select p3=new Select(day);
	p3.selectByVisibleText("23");
	
	
	d.findElement(By.id("firstpassword")).sendKeys("123456");
	d.findElement(By.id("secondpassword")).sendKeys("123456");
	
	d.findElement(By.xpath("//*[text()=' Submit ']")).click();
		

	}

}
