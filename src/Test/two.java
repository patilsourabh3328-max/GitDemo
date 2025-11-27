package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class two {

	public static void main(String[] args) throws InterruptedException  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		WebElement sp=d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s= new Select(sp);
		s.selectByIndex(3);
		
		String dp =s.getFirstSelectedOption().getText();
		System.out.println(dp);
		
		// multiple dropdown
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		WebElement rp=d.findElement(By.id("hrefIncAdt"));
		
		for(int i=0;i<5;i++) {
			rp.click();
			}
			//int i=0;
		//while(i<6) {
			//rp.click();
			//i++;
		//}	
		
		
		
	
		d.findElement(By.id("btnclosepaxoption")).click();
	}
}
