import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.beans.Transient;

public class practiceExample1 {
    WebDriver driver;
    String URL = "https://www.google.com/";
@Test
    public void LaunchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Practice1\\src\\test\\resources\\Binaries\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        Thread.sleep(1000);
        closeBrowser();
    }
    public void closeBrowser() {
        driver.quit();
    }

   /*     public static void main(String[] args) throws InterruptedException {
practiceExample1 obj = new practiceExample1();
obj.LaunchBrowser();
obj.closeBrowser();
    }
    */
}