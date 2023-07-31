package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class CartPage extends PageBase {
    public String prodname;
    public String cart_name;

    public String actualquant;

    public CartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"nav-main\"]/div[1]")
    WebElement allcategory;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[17]")
    WebElement todaydeals;
    @FindBy(xpath = "//*[@id=\"anonCarousel1\"]/ol/li[5]/a/span[1]")
    WebElement secondcategory;
    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[3]/div/div[2]/div/div/a/div")
    WebElement firstproduct;
    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[3]/div/div[2]/div/div/a/div/div")
    WebElement seconditem;
    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement quant_list;
    @FindBy(xpath = "//*[@id=\"submit.add-to-cart\"]")
    WebElement add2cart;

    @FindBy (xpath = "//*[@id=\"attachSiAddCoverage\"]/span/input")
            WebElement daman;
    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    WebElement cart;
    /*productinfo*/
    @FindBy(xpath = "//*[@id=\"productTitle\"]")
    WebElement productname;
    @FindBy(xpath = "//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[2]")
    WebElement productprice;
    @FindBy(xpath = "//*[@id=\"ewc-content\"]/div[1]/div/div/div[2]/div[2]/span/span")
    WebElement productsubtotal;
    /*cart items*/
    @FindBy(className ="a-truncate-cut")
    WebElement cartitemname;
    @FindBy(xpath = "//*[@id=\"sc-active-30afc581-031e-4564-9212-2dbdd9ff84cc\"]/div[4]/div/div[2]/ul/div/div/div[1]/p/span")
    WebElement cartitemprice;
    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]")
    WebElement cartitemquant;
    @FindBy(xpath = "//*[@id=\"sc-subtotal-amount-activecart\"]/span")
    WebElement cartsubtotal;
    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]")
    WebElement languages;
//    @FindBy(xpath = "//*[@id=\"icp-language-settings\"]/div[3]/div/label/span")
//    WebElement eng_lang;
//    @FindBy(xpath = "//*[@id=\"icp-save-button\"]/span/input")
//    WebElement confirm_lang;

//    public void choocelang() throws InterruptedException {
//        languages.click();
//        eng_lang.click();
//        confirm_lang.click();
//        Thread.sleep(3000);
//
//
//    }

    public void addtocart() throws InterruptedException {
        allcategory.click();
        Thread.sleep(5000);
        todaydeals.click();
        Thread.sleep(5000);
        secondcategory.click();
        Thread.sleep(5000);
        firstproduct.click();
        Thread.sleep(5000);
        seconditem.click();
        Thread.sleep(3000);
        prodname = productname.getText();
        System.out.println(prodname);

        Select quant = new Select(quant_list);
        quant.selectByVisibleText("2");
        actualquant = quant_list.getText();
        Thread.sleep(3000);
//        checkbox.click();
        add2cart.click();
        Thread.sleep(5000);
//        daman.click();
//        Thread.sleep(5000);
        cart.click();
        Thread.sleep(3000);
        cart_name=cartitemname.getText();
        System.out.println(cart_name);

    }

    public String getcartitemname() {
        return cart_name;
    }

    public String getcartitemprice() {
        return cartitemprice.getText();
    }

    public String getcartitemquant() {
        return cartitemquant.getText();
    }

    public String getcartsubtotal() {
        return cartsubtotal.getText();
    }

    public String getproductname() {


        return prodname;

    }

    public String getproductprice() {


        return productprice.getText();

    }

    public String setProduct_quant(String product_quant) {
        return product_quant;
    }

    public String prodcutsub() {

        return productsubtotal.getText();
    }

    public String getactualquant() {

        return actualquant;

    }


}
