package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class ReportTest {
    @Test
    public void test01() {
        ExtentReports extentReports = new ExtentReports();

        ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("TLA Class"); // organization title
        spark.config().setReportName("My Store 5");

        extentReports.attachReporter(spark);

        ExtentTest extentTest = extentReports.createTest("FooterInfoTest List Varification");

        extentTest.assignAuthor("Irina");
        extentTest.assignDevice("PC Win 11");

    }
}
