package Test;

import java.io.File;
import java.io.IOException;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screen {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		d.get("https://meet.google.com/landing");
		
		TakesScreenshot t= (TakesScreenshot)d;
		File souce =t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(souce, new File("C:\\Users\\SOURABH\\Desktop\\test data\\"+"image2.png")); 
		
		System.out.println("all done");
		
		

	}

}
