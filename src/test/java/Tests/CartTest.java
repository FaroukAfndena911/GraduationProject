package Tests;

import Pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartTest extends TestBase {


    @Test
    public void addtocart() throws InterruptedException {
        CartPage cp = new CartPage(driver);
        cp.addtocart();
        String prodname = cp.getproductname();
        String cartnam = cp.getcartitemname();
        Assert.assertEquals(prodname,cartnam);


    }

}
