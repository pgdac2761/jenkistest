package basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

    @org.junit.jupiter.api.Test
    public void yelpTest() {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.yelp.com/");
        


        WebElement searchTxt = driver.findElement(By.id("search_description"));
        searchTxt.sendKeys("Restaurants");
        driver.findElement(By.xpath("//button[@aria-label=\"Search\"]")).click();
        

        assertEquals("TOP 10 BEST Restaurants in San Francisco, CA - January 2024 - Yelp", driver.getTitle());
      
        if("TOP 10 BEST Restaurants in San Francisco, CA - January 2024 - Yelp".equalsIgnoreCase(driver.getTitle())) {
        	System.out.println("Test successfull");
        }else {
        	System.out.println("Test failed");
        }
    }
}