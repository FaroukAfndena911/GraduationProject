package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccessPage extends PageBase {
    public UserAccessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement hello;
    @FindBy(xpath = "//*[@id=\"nav_prefetch_yourorders\"]/span")
    WebElement myorders;
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1")
    WebElement sign;
    @FindBy (xpath = "//*[@id=\"nav_prefetch_youraddresses\"]/span")
    WebElement myadresses;
    @FindBy (xpath = "//*[@id=\"nav-al-your-account\"]/a[4]/span")
    WebElement mylist;


    public void myorders() throws InterruptedException {
        myorders.click();
        gettitle();

    }
    public void myadress(){

        myadresses.click();
        gettitle();
    }

    public void mylist(){

        mylist.click();
    }

    public String gettitle() {

        return sign.getText();
    }
}

