package Test;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {

	public static void main(String[] args) {
	
		String []RequiredList= {"Cucumber","Potato","Pumpkin "};
		List FinalList=Arrays.asList(RequiredList);
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement>all=d.findElements(By.xpath("//div[@class='products']/div/h4"));
		for(WebElement single:all) {
			String text=single.getText();
			if(FinalList.contains(text)){
				System.out.println("yes");
			}
		}
		
		
	}

}