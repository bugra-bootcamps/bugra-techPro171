package project_team09.tests.us04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_team09.pages.ShippingAddressPageMeryem;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class Tc01 {

    @Test
    public void test01() {
signIn();
//acılan sayfadaki "Adresses" elementine tıkla
        ShippingAddressPageMeryem shipping =new ShippingAddressPageMeryem();
        shipping .addressesButton.click();
//Shipping Address başlığının altındaki "ADD" butonuna tıkla
        /*
        add değil "Edit Your Shipping Address" butonu olacak cünkü mevcut bir adres var
         */
        //webelementi görmesi için scroll yapmalıyız.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        shipping .editYourShippingAddressButton.click();

//"First name" kutusuna first name ekle
        String firstName=ConfigReader.getProperty("degistirilecekFirstName");
        shipping .firstNameBox.clear();
        shipping .firstNameBox.sendKeys(firstName);
//"Last name" kutusuna last name ekle
        String lastName=ConfigReader.getProperty("degistirilecekLastName");
        shipping.lastNameBox.clear();
        shipping.lastNameBox.sendKeys(lastName);
//"Company name (optional)" butonuna campany name ekle
        String companyName=ConfigReader.getProperty("degistirilecekCompanyName");
        shipping.companyNameBox.clear();
        shipping.companyNameBox.sendKeys(companyName);
//"Country/Region" ddm den secim yap
        Select select=new Select(shipping .countryDdm);
        shipping.countryDdm.clear();
        select.selectByVisibleText(ConfigReader.getProperty("degistirilecekCountry")+Keys.ENTER);
//"Street address" ilk butona house number ve street name yaz
        String addressIlkBox=ConfigReader.getProperty("degistirilecekAdressIlkBox");
        shipping.streetAddressFirstBox.clear();
        shipping.streetAddressFirstBox.sendKeys(addressIlkBox);
//"Street address" ikinci butona apartman ismi yaz
        String addressIkinciBox=ConfigReader.getProperty("degistirilecekAdressIkinciBox");
        shipping.streetAddressSeccondBox.clear();
        shipping.streetAddressSeccondBox.sendKeys(addressIkinciBox);
//"Postcode / ZIP" kısmına posta kodu yaz
        String postcode=ConfigReader.getProperty("degistirilecekPostcode");
        shipping.postcodeBox.clear();
        shipping.postcodeBox.sendKeys(postcode);
//"Town / City" kısmına sehrini yaz
        String town=ConfigReader.getProperty("degistirilecekTown");
        shipping.townBox.clear();
        shipping.townBox.sendKeys(town);
//"Province" ddm den sehirini seç
        Select select1=new Select(shipping.provinceDdm);
        shipping.provinceDdm.clear();
        select1.selectByVisibleText(ConfigReader.getProperty("degistirilecekProvince")+Keys.ENTER);
//"SAVE ADRESS" butonuna tıkla
        shipping.saveAddressButton.click();
//"Address changed successfully." mesajının çıktığını doğrula
        String expectedMsj="Address changed successfully.";
        String actualMsj;

    }
    public void signIn() {
        //stiye git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
//sign ın butonuna tıkla
        ShippingAddressPageMeryem registerPage=new ShippingAddressPageMeryem();
        registerPage.signInButton.click();
//acılan ekranda username  kutusuna username'i gir
//password kutusuna password'u gir
//sign ın butonuna tıkla
        String username=ConfigReader.getProperty("username");
        String password=ConfigReader.getProperty("password");
        registerPage.usernameButton.sendKeys(username, Keys.TAB,password,Keys.ENTER);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();

        /*
        testcase de aşadaki step eksik
         */
 // acılan sayfadaki sag üstteki signout sekmesine tıkla.(My accont sayfası acılmalı)
       registerPage.signOut.click();//My Account sayfası acılacak
    }
}
