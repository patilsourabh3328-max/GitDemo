package Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/seleniumPractise/");
		
	String [] sp= {"Brocolli - 1 Kg","Cauliflower - 1 Kg"};
		List<String> sp2=Arrays.asList(sp);
		
		List<WebElement>all=d.findElements(By.xpath("//div[@class='products-wrapper']/div/div/h4"));
		List <WebElement>buttons= d.findElements(By.xpath("//*[text()='ADD TO CART']"));
		
		for(int i=0;i<=all.size();i++) {
			if(sp2.contains(all.get(i).getText())) {
				buttons.get(i).click();
			}
			
		}
		
		
		
		
		
	}

}
