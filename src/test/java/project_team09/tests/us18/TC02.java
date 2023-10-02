package project_team09.tests.us18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_team09.pages.us18_19_20.Loginpage;
import project_team09.pages.us18_19_20.MyAccountPageSÖ;
import project_team09.pages.us18_19_20.Orders;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class TC02 {


        @Test
        public void test01(){

            MyAccountPageSÖ myAccountPageSÖ = new MyAccountPageSÖ();
            Loginpage loginpage = new Loginpage();
            Orders orders = new Orders();


            //Anasayfaya gidip sing in olunmali
            Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

            loginpage.singIn.click();
            ReusableMethods.bekle(2);

            loginpage.userName.sendKeys(ConfigReader.getProperty("mailUs18"));
            loginpage.password.sendKeys(ConfigReader.getProperty("passwordUs18"), Keys.ENTER);
            ReusableMethods.bekle(3);

            //Code yazabilmeliyim
            //Description yazılabilmeli
            Actions action = new Actions(Driver.getDriver());

            action.sendKeys(Keys.PAGE_DOWN,
                    Keys.PAGE_DOWN,
                    Keys.PAGE_DOWN,
                    Keys.PAGE_DOWN,
                    Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(3);
            orders.myAccountSayfaEnAlt.click();

            orders.storeManager.click();
            ReusableMethods.bekle(5);
            action.sendKeys(Keys.PAGE_DOWN).perform();
            orders.coupons.click();
            ReusableMethods.bekle(5);
            orders.addNewCoupon.click();
            ReusableMethods.bekle(5);

            JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].value='Tek9638'",orders.code);
            js.executeScript("arguments[0].value='Teknolojik Aletler Icin Gecerlidir.'",orders.couponDescription);

            //Discount Type; Percentage discount veya Fixed Product Discount olarak seçilebilmeli
            ReusableMethods.bekle(5);
            Select ddm = new Select(orders.discontType);
            ddm.selectByVisibleText(ConfigReader.getProperty("couponDiscontType"));

            //Coupon Amount yazılabilmeli
            //Coupon expiry date girilebilmeli
            ReusableMethods.bekle(5);
            js.executeScript("arguments[0].value='20'",orders.couponAmount);
            js.executeScript("arguments[0].value='2023.08.01'",orders.couponExpiryDate);
            action.sendKeys(Keys.PAGE_DOWN).perform();

            //Allow free shipping, Show on store seçilebilmeli
            ReusableMethods.bekle(5);
            js.executeScript("arguments[0].click();",orders.couponChechBox1);
            js.executeScript("arguments[0].click();",orders.couponChechBox2);
            ReusableMethods.bekle(5);
            js.executeScript("arguments[0].click();",orders.couponSubmit);
            ReusableMethods.bekle(5);
            orders.coupons.click();
            ReusableMethods.bekle(5);

            //Coupons oluşturulduğu görülmeli
            Assert.assertTrue(orders.couponVerify.isDisplayed());
        }

}




