package project_team09.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

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
    }
}
