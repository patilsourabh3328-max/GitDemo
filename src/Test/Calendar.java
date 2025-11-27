package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		d.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"]")).click();
		
		d.findElement(By.xpath("//*[text()='23']")).click();
		
		
	}
}
