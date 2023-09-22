package project_team09.tests.us10;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import project_team09.pages.MyAccountPage;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.ExtentReport;
import project_team09.utilities.ReusableMethods;

public class Us10 extends ExtentReport {


    @DataProvider
    public static Object[][] Password() {
        return new Object[][]{
                {ConfigReader.getProperty("tooshort"),
                        ConfigReader.getProperty("weak"),
                        ConfigReader.getProperty("good"),
                        ConfigReader.getProperty("strong")},

                {ConfigReader.getProperty("tooshort2"),
                        ConfigReader.getProperty("weak2"),
                        ConfigReader.getProperty("good2"),
                        ConfigReader.getProperty("strong2")}

        };
    }



    @Test(dataProvider = "Password")
    public void test01(String tooshort, String weak, String good, String strong) {
        ReusableMethods.vendorKayit();
        extentTest = ExtentReport.extentReports.createTest("Vendor Kaydı US-10 TC-01", "Password seviyeleri görülebilmeli (Vendor Kaydı için)");

        extentTest.info("Anasayfaya gidildi.");
        extentTest.info("Tum sayfa resmi alındı");
        extentTest.info("Register butonuna tiklandı");
        extentTest.pass("Çıkan ekranda 'Become a Vendor' yazısının göründüğü doğrulandı.");
        extentTest.info("Become a Vendor butonuna tıklandı.");
        extentTest.pass("Vendor Registration sayfasının göründüğü doğrulandı");

        //Password alanina 6 karakterden az bir password gir.
        MyAccountPage MyAccountPage = new MyAccountPage();
        MyAccountPage.PasswordTextBoxLocate.sendKeys(tooshort);
        extentTest.info("Password alanina 6 karakterden az bir password girildi.");

        //"Too short" mesajının göründüğünü doğrula.
        Assert.assertEquals(ConfigReader.getProperty("short"), MyAccountPage.verifyPassword.getText());
        extentTest.info("Too short mesajının göründüğü doğrulandı.");
        ReusableMethods.webElementResmi(MyAccountPage.verifyPassword);
        extentTest.info("Webelement resmi alındı.(Too short)");


        //"Password alanina 6 karakterli sadece rakam veya küçük harf veya büyük harf veya special karakter içeren bir password gir.
        //(4 kriter aynı anda kullanılmayacak)"
        MyAccountPage.PasswordTextBoxLocate.sendKeys(weak);
        extentTest.info("Password alanina 6 karakterli sadece rakam veya küçük harf veya büyük harf veya special karakter içeren bir password girildi");




        //EXTENT İNFOLARI DÜZENLEYECEKSİN!!!!!!!!!!!!!!!!!!!!!




        //"Weak" mesajının göründüğünü doğrula.
        Assert.assertEquals("Weak",MyAccountPage.verifyPassword.getText());
        extentTest.pass("Weak mesajının göründüğü doğrulandı.");
        ReusableMethods.webElementResmi(MyAccountPage.verifyPassword);
        extentTest.info("Webelement resmi alındı.(Weak)");

        //Passwordu alanındaki passwordu sil.
        MyAccountPage.PasswordTextBoxLocate.clear();
        extentTest.info("Passwordu alanındaki password silindi.");

        //Password 6 karakterli en az bir büyük harf, küçük harf, rakam ve special karakter içeren bir password gir.
        MyAccountPage.PasswordTextBoxLocate.sendKeys(good);
        extentTest.info("Password 6 karakterli en az bir büyük harf, küçük harf, rakam ve special karakter içeren bir password girildi.");

        //"Good" mesajının göründüğünü doğrula.
        Assert.assertEquals("Good",MyAccountPage.verifyPassword.getText());
        extentTest.pass("Good mesajının göründüğü doğrulandı.");
        ReusableMethods.webElementResmi(MyAccountPage.verifyPassword);
        extentTest.info("Webelement resmi alındı.(Good)");
        //Passwordu alanındaki passwordu sil.
        MyAccountPage.PasswordTextBoxLocate.clear();
        extentTest.info("Passwordu alanındaki password silindi.");



    }
}
