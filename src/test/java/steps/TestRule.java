package steps;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRule {

    private static WebDriver driver;
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports reportManager;
    private static ExtentTest testLogs;

    @Before
    public void beforeScenario(Scenario scenario){
        launchChrome();
        initReport(scenario);
    }

    @After
    public void afterScenario(Scenario scenario){
        writeReport(scenario);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static ExtentTest getTestLogs(){
        return testLogs;
    }

    private void launchChrome(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com.br/");
    }

    private void initReport(Scenario scenario){
        if(reportManager == null){
            reportManager = new ExtentReports();
            htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
            reportManager.attachReporter(htmlReporter);
        }

        testLogs = reportManager.createTest(scenario.getId());
    }

    private void writeReport(Scenario scenario){
        testLogs.log(Status.PASS, "Cenário " + scenario.getName() + " executado com sucesso!!!");
        reportManager.flush();
    }
}
