package utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import steps.TestRule;

import java.io.File;
import java.io.IOException;

public class ReportUtils {

    public static void logPrint(String message){
        ExtentTest testLogs = TestRule.getTestLogs();
        try {
            String filePath = printScreen(message);
            testLogs.log(Status.INFO, message, MediaEntityBuilder.createScreenCaptureFromPath(filePath).build());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String printScreen(String message){
        File file = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\" + message + ".png";
            FileUtils.copyFile(file, new File(filePath));
            return filePath;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
