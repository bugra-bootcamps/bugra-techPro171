package project_team09.tests.us09;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import project_team09.pages.Hilal.Fakeremail;
import project_team09.pages.Hilal.Fakeremail;
import project_team09.pages.Hilal.VendorGiris;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class TC01 {
    @Test
    public void tc01() {

        VendorGiris vendorGiris= new VendorGiris();
       Fakeremail fakeremail = new Fakeremail();


        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allowerCommerceUrl"));


        //Registera butonuna tıkla

        vendorGiris.SıngIN.click();
        ReusableMethods.bekle(3);
        //sign up button tıkla
        vendorGiris.signUp.click();
        ReusableMethods.bekle(3);


        //Become vendor Butonuna tıkla
        ReusableMethods.bekle(3);
        vendorGiris.becomeVendor.click();
        ReusableMethods.bekle(3);

        //Email alanina email gir.
      Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        ReusableMethods.window(1);
        Driver.getDriver().get(ConfigReader.getProperty("FakerUrl"));
        ReusableMethods.bekle(3);
        fakeremail.fakeMailKutu.click();
        ReusableMethods.window(0);
        ReusableMethods.bekle(3);
     vendorGiris.email.click();
      ReusableMethods.bekle(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys("v").release().perform();
        ReusableMethods.bekle(2);





      /* //Fake mail sitesini yeni bir sekmede açar
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("FakerUrl"));

        //Fake maili kopyalar
       /* Fakeremail.FakerCopy.sendKeys(Keys.TAB,Keys.TAB);
        ReusableMethods.click(VendorGiris.email);


        ReusableMethods.bekle(3);
        Fakeremail.FakerCopy.sendKeys(Keys.TAB,Keys.TAB);
        Fakeremail.FakerCopy.click();
        //Gecerli e mail adresini girer
        ReusableMethods.switchToWindow(0);

  */






    }
}
