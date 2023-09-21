package project_team09.tests.us06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_team09.pages.Hamza.HomePage;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

import java.util.Properties;

public class TC01 {


    @Test
    public void test01() {

        //Web sitesine gidilir	https://allovercommerce.com/	Web sitesine erişilebilmeli.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceURL"));


        //SigIn butonuna tiklanir 		SigIn Sayfasi erisebilmeli
        HomePage homePage = new HomePage();
        homePage.SignInButton.click();


        //Gecerli bilgiler girilir	"frances.bryken@feerock.com
        //Deneme123Deneme"	"Gecerli bilgiler ile giris yapilabilmeli"
        homePage.Username.sendKeys(ConfigReader.getProperty("username"), Keys.TAB,ConfigReader.getProperty("password"),Keys.ENTER);
        ReusableMethods.bekle(3);


        //"Arama kutusundan istedigi ürünü arama yapilir" "Shoes"	Arama sonucu dogru oldugunu kontrol eder
        homePage.aramaKutusu.sendKeys("Shoes",Keys.ENTER);
        Assert.assertTrue(homePage.aramaSonucu.getText().contains("Shoes"));

    }
}
