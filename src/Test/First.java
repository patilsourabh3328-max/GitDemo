package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

	public static void main(String[] args) throws Exception {
	
		
	WebDriverManager.chromedriver().setup();	
	WebDriver d= new ChromeDriver();
	
	   d.get("https://rahulshettyacademy.com/locatorspractice/");
	   d.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Sp");
	   d.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
	  
	   d.findElement(By.xpath("//*[text()='Sign In']")).click();
	   Thread.sleep(2000);
		String a=  d.findElement(By.tagName("p")).getText();
String  b[]=a.split("are");
String c[]=b[1].split(" ");
System.out.println(c[0]);

//You are successfully logged in.

System.out.println("New Jined member code - First code updatd ");
System.out.println("New Jined member code - Second code updatd");
System.out.println("Main Owner Updated - Third code updatd");	
System.out.println("new member - updated fourth time");

System.out.println("new branch added with new code");
System.out.println("new branch added with new code----22222");

}}

