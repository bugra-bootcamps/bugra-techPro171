package project_team09.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import project_team09.utilities.Driver;
import project_team09.utilities.ReusableMethods;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ExtentReport {

    protected ExtentReports extentReport;//-->raporlamayı başlatır
    protected ExtentHtmlReporter extentHtmlReporter;//-->Html formatında rapor oluşturur
    protected ExtentTest extentTest;//-->Test adımlarına bilgi eklenir

    public void rapor(String browser, String reportName) {
        extentReport = new ExtentReports();
        String tarih1 = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu1 = "target/extentReport/report" + tarih1 + ".html";
        extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu1);
        extentReport.attachReporter(extentHtmlReporter);

        //Raporda gözükmesini istediğimiz bilgiler
        extentReport.setSystemInfo("Tester", "Erol");
        extentReport.setSystemInfo("browser", browser);
        extentHtmlReporter.config().setDocumentTitle("ExtentReport");
        extentHtmlReporter.config().setReportName(reportName);

    @BeforeTest(alwaysRun = true)
    public void setUpTest() {
        extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/reports/extentReport_" + tarih + ".html";
        extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Tester", "Rana");
        extentHtmlReporter.config().setDocumentTitle("Extent Report");
        extentHtmlReporter.config().setReportName("TestNG Reports");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
            String screenshotLocation = ReusableMethods.tumSayfaResmi(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
            extentTest.skip("Test Case is skipped: " + result.getName());
        }
        Driver.closeDriver();

        if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
            String screenshotLocation = ReusableMethods.tumSayfaResmi(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            //extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
            extentTest.skip("Test Case is skipped: " + result.getName());
        }
        //Driver.closeDriver();

    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();

    }
}
