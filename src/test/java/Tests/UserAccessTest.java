package Tests;

import Pages.UserAccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAccessTest extends TestBase {
    @Test
    public void hellofun() throws InterruptedException {
        movetohello();
        Thread.sleep(5000);
        UserAccessPage us = new UserAccessPage(driver);
        us.myorders();
        Thread.sleep(3000);
        String error = us.gettitle();
        Assert.assertEquals(error, "Sign in");
        driver.navigate().back();
        Thread.sleep(3000);
        movetohello();
        Thread.sleep(3000);
        us.myadress();
        Assert.assertEquals(error, "Sign in");
        driver.navigate().back();
        Thread.sleep(3000);
        movetohello();
        Thread.sleep(3000);
        us.mylist();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.eg/hz/wishlist/intro");
    }

    public void movetohello() {
        WebElement hello = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hello).perform();


    }
}
