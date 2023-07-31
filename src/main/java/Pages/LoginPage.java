package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/div")
    WebElement hellobtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[6]")
    WebElement fashion;
    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "continue")
    WebElement continue_btn;
    @FindBy(id = "ap_password")
    WebElement pass_txt;
    @FindBy(id = "signInSubmit")
    WebElement signin;
    @FindBy(xpath = "//*[@id=\"auth-email-missing-alert\"]/div/div")
    WebElement errormessage;


    public void navigatetologin() {
        hellobtn.click();
    }
    public String geterrormessage()
    {

        return errormessage.getText();
    }

    public void invalid_login(String emailtxt) throws InterruptedException {


        email.sendKeys(emailtxt);
        email.clear();
        continue_btn.click();
        Thread.sleep(5000);



    }


}
