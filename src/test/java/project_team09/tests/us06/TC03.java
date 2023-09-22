package project_team09.tests.us06;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import project_team09.pages.Hamza.HomePage;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;

public class TC03 {

    @Test
    public void test03() {

        //Web sitesine gidilir	https://allovercommerce.com/	Web sitesine erişilebilmeli.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceURL"));

        //SigIn butonuna tiklanir 		SigIn Sayfasi erisebilmeli
        HomePage homePage = new HomePage();
        homePage.SignInButton.click();

        //Gecerli bilgiler girilir	"frances.bryken@feerock.com
        //Deneme123Deneme"	"Gecerli bilgiler ile giris yapilabilmeli"
        homePage.Username.sendKeys(ConfigReader.getProperty("username"), Keys.TAB,ConfigReader.getProperty("password"),Keys.ENTER);
        ReusableMethods.bekle(3);

        //"Arama kutusundan istedigi ürünü arama yapilir"	"shoes"	 Arama sonucuna erisebilmeli
        homePage.aramaKutusu.sendKeys("Shoes",Keys.ENTER);

        //Istenilen ürüne tiklanir		tiklanan ürün erisebilmeli

        //"""ADD TO CART"" buttonuna tiklanir "ADD TO CART" erisebilmeli

        //"Sayfada Cart buttonuna tiklanir Cart erisebilmeli

        //Ürünü eklendigini test edilir		Ürün eklendigini test edilir

    }
}
