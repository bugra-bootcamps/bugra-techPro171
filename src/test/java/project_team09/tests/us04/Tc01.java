package project_team09.tests.us04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
//stiye git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
//sign ın butonuna tıkla
        ShippingAddressPageMeryem shipping =new ShippingAddressPageMeryem();
        shipping.signInButton.click();
//acılan ekranda username  kutusuna username'i gir
//password kutusuna password'u gir
//sign ın butonuna tıkla
        String username=ConfigReader.getProperty("usernamemeMo");
        String password=ConfigReader.getProperty("passwordMo");
        shipping.usernameButton.sendKeys(username, Keys.TAB,password,Keys.ENTER);
         ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();

        /*
        testcase excell de aşadaki step eksik
         */
        // acılan sayfadaki sag üstteki signout sekmesine tıkla.(My accont sayfası acılmalı)
        shipping.signOut.click();//My Account sayfası acılacak
//acılan sayfadaki "Adresses" elementine tıkla
        //ShippingAddressPageMeryem shipping =new ShippingAddressPageMeryem();
        shipping .addressesButton.click();
//Shipping Address başlığının altındaki "ADD"/"Edit Your Shipping Address" butonuna tıkla
        //webelementi görmesi için scroll yapmalıyız.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        shipping .editYourShippingAddressButton.click();
//"First name" kutusuna first name ekle
        String firstName=ConfigReader.getProperty("degistirilecekFirstName");
        shipping .firstNameBox.clear();
        shipping .firstNameBox.sendKeys(firstName);
//"Last name" kutusuna last name ekle
        String lastName=ConfigReader.getProperty("degistirilecekLastName");
        shipping.lastNameBox.clear();
        shipping.lastNameBox.sendKeys(lastName);
        ReusableMethods.bekle(2);
//"Company name (optional)" butonuna campany name ekle
        String companyName=ConfigReader.getProperty("degistirilecekCompanyName");
        shipping.companyNameBox.clear();
        shipping.companyNameBox.sendKeys(companyName);
        ReusableMethods.bekle(2);
//"Country/Region" ddm den secim yap
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        WebElement ddmCountry= shipping.countryDdm;
        Select select=new Select(ddmCountry);
        select.selectByVisibleText(ConfigReader.getProperty("degistirilecekCountry"));
//"Street address" ilk butona house number ve street name yaz
        String addressIlkBox=ConfigReader.getProperty("degistirilecekAdressIlkBox");
        shipping.streetAddressFirstBox.clear();
        shipping.streetAddressFirstBox.sendKeys(addressIlkBox);
        ReusableMethods.bekle(2);
//"Street address" ikinci butona apartman ismi yaz
        String addressIkinciBox=ConfigReader.getProperty("degistirilecekAdresIkinciBox");
        shipping.streetAddressSeccondBox.clear();
        shipping.streetAddressSeccondBox.sendKeys(addressIkinciBox);
//"Postcode / ZIP" kısmına posta kodu yaz
        String postcode=ConfigReader.getProperty("degistirilecekPostcode");
        ReusableMethods.bekle(2);
        shipping.postcodeBox.clear();
        ReusableMethods.bekle(2);
        shipping.postcodeBox.sendKeys(postcode);
//"Town / City" kısmına sehrini yaz
        String town=ConfigReader.getProperty("degistirilecekTown");
        shipping.townBox.clear();
        ReusableMethods.bekle(2);
        shipping.townBox.sendKeys(town);
//"Province" ddm den sehirini seç
        Select select1=new Select(shipping.provinceDdm);
        //shipping.provinceDdm.clear();
        ReusableMethods.bekle(2);
        select1.selectByVisibleText(ConfigReader.getProperty("degistirilecekProvince"));
//"SAVE ADRESS" butonuna tıkla
        shipping.saveAddressButton.click();
//"Address changed successfully." mesajının çıktığını doğrula
        String expectedMsj="Address changed successfully.";
        String actualMsj;

    }}
   /* public void signIn() {
        //stiye git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
//sign ın butonuna tıkla
        ShippingAddressPageMeryem shipping =new ShippingAddressPageMeryem();
        shipping.signInButton.click();
//acılan ekranda username  kutusuna username'i gir
//password kutusuna password'u gir
//sign ın butonuna tıkla
        String username=ConfigReader.getProperty("usernameMo");
        String password=ConfigReader.getProperty("passwordMo");
        shipping.usernameButton.sendKeys(username, Keys.TAB,password,Keys.ENTER);
       // ReusableMethods.bekle(2);
        //Driver.getDriver().navigate().refresh();

        /*
        testcase de aşadaki step eksik

 // acılan sayfadaki sag üstteki signout sekmesine tıkla.(My accont sayfası acılmalı)
       shipping.signOut.click();//My Account sayfası acılacak
    }*/

