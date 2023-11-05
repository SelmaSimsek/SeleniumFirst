package day01_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c01_DriverIlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver", "src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

    }
}
