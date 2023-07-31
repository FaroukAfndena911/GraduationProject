package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @DataProvider(name = "testdata")
    public Object[][] testdata() {
        return new Object[][]{
                {"test1133555@gmail.com"},
                {"mfarouktest@gmail.com"},
                {"test1133555@gmail.com"},
                {"mtest6999mht@gmail.com"}


        };
    }

    @BeforeTest
    public void movtologin () throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.navigatetologin();
        Thread.sleep(3000);


    }
    @Test (dataProvider = "testdata")
    public void invalidlogin(String email) throws InterruptedException {

        LoginPage lp = new LoginPage(driver);


        lp.invalid_login(email);
        String error=lp.geterrormessage();
        Assert.assertEquals(error,"أدخل بريدك الإلكتروني أو رقم الهاتف");



    }
}
