package Test;


import java.time.Duration;
import java.util.*;
import java.util.regex.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedInEmailScraper {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();

        // 🔥 Use existing logged-in Chrome profile
        ChromeOptions options = new ChromeOptions();
   

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1️⃣ Open LinkedIn Jobs (already logged in)
        driver.get("https://www.linkedin.com/jobs");

        // 2️⃣ Search "QA Remote"
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search jobs']"));
        search.sendKeys("QA Remote", Keys.ENTER);

        Thread.sleep(5000);

        // 3️⃣ Get job cards
        List<WebElement> jobPosts = driver.findElements(By.cssSelector(".jobs-search-results__list-item"));

        Set<String> emails = new HashSet<>();

        // 4️⃣ Loop through posts
        for (int i = 0; i < jobPosts.size(); i++) {
            jobPosts.get(i).click();
            Thread.sleep(3000);

            String text = driver.findElement(By.tagName("body")).getText();

            // REGEX for email
            Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
            Matcher match = pattern.matcher(text);

            while (match.find()) {
                emails.add(match.group());
            }
        }

        // 5️⃣ Print All Emails
        System.out.println("========= EMAILS FOUND =========");
        for (String e : emails) {
            System.out.println(e);
        }

        driver.quit();
    }
}
