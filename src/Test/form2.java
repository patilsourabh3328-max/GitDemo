package Test;

import java.lang.ModuleLayer.Controller;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class form2 {

	public static void main(String[] args)  {
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Datepicker.html");
		
	//	d.findElement(By.xpath("//*[text()='click']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	//String monthNumber = "6";
//		String date = "15";
//		String year = "2027";
//      	String[] expectedList = {monthNumber,date,year};
//	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	d.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
//
//	d.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
//
//	d.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
//
//	d.findElement(By.xpath("//button[text()='"+year+"']")).click();
//
//	d.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
//
//	d.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
//
//	List<WebElement> actualList = d.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
//
//	for(int i =0; i<actualList.size();i++)
//
//	{
//	System.out.println(actualList.get(i).getAttribute("value"));
//
//	Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
//	}

//	}
	
		
//}
		String month="May";
		int day=24;
		int year=1996;
		
		d.findElement(By.id("datepicker1")).click();
		
	while (true) {
		String months=d.findElement(By.className("ui-datepicker-month")).getText();
		String years=d.findElement(By.className("ui-datepicker-year")).getText();
		
		if(months.equals(month)&&years.equals(year)) {
			break;
		}
		 d.findElement(By.xpath("//a[@title='Next']")).click();
		
	}
	d.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}
		

	}
		
	
	
	
		
	