package Test;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class act {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Windows.html");
		String parent=d.getWindowHandle();
		System.out.println(d.getWindowHandle());
	d.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
	Set<String>all=d.getWindowHandles();
	Iterator<String> it=all.iterator();
	String first=it.next();
	String second=it.next();
	d.switchTo().window(second);
	System.out.println(d.getWindowHandle());
	
	//
	//for(String single:all) {
		//if(!single.equals(parent)){
			//d.switchTo().window(single);
			//System.out.println(d.getWindowHandle());
			
		//}
	}	
	
	
	
		
	}
	
	
	

