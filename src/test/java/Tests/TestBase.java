package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/?language=en_AE");
        driver.manage().window().maximize();
        Thread.sleep(5000);
//        WebElement langauages = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]"));
//        langauages.click();
//        Thread.sleep(3000);
//        WebElement eng_lang = driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
//        eng_lang.click();
//        Thread.sleep(3000);
//        WebElement sumbit = driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input"));
//        sumbit.click();
//        Thread.sleep(3000);


//    WebElement hello= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div"));
//    hello.click();


    }


}

