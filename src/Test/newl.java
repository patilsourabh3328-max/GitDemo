package Test;

	import java.util.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class newl {
	    public static void main(String[] args) throws Exception {
	    	
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	        Thread.sleep(3000);
	        
	        String[] items = {"Cucumber", "Brocolli", "Beetroot"};
	        List<String> list = Arrays.asList(items);
	        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	        List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']/button"));
	        
	        for (int i = 0; i < products.size(); i++)
	            if (list.contains(products.get(i).getText().split("-")[0].trim()))
	                buttons.get(i).click();
	       
	    }
	}

