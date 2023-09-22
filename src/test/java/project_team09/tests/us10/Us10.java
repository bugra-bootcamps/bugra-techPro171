package project_team09.tests.us10;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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

    ExtentReport rapor = new ExtentReport() {
    };

    @Test(dataProvider = "Password")
    public void test01(String sort, String weak, String good, String strong) {
        ReusableMethods.venderKayit();
        extentTest = ExtentReport. ("Vendor Kaydı US010 TC01", "Password seviyeleri görülebilmeli (Vendor Kaydı için)");

    }
}
