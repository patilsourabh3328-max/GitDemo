package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/angularpractice/");

		d.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Sourabh");
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.id("exampleCheck1")).click();

		WebElement se = d.findElement(By.id("exampleFormControlSelect1"));

		Select s = new Select(se);
		s.selectByIndex(1);

		d.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//div[@class='form-group'])[6]/input")).click();

	}

}
