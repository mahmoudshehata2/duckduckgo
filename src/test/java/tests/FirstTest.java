package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

     @Test
    public void test() {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.get("");

     }
}
