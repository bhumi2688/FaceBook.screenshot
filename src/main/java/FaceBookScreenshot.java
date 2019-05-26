import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.sql.Driver;

public class FaceBookScreenshot extends Utils {
    WebDriver driver ;

    @Test
    public void captureScreenshot() throws Exception  {

       System.setProperty("webdriver.gecko.driver","src\\main\\BrowserDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");

        driver.findElement(By.xpath("")).sendKeys("Learn Automation");

        //taken object for takesscreenshot
        TakesScreenshot ts = (TakesScreenshot)driver;

        //calling screen shot method
       File source = ts.getScreenshotAs(OutputType.FILE ) ;
      //FileUtils.copyFile(source,new File("./Screenshots/facebook.png") );
        FileHandler.copy(source,new File("./Screenshots/facebook.png") );
       System.out.println("Screenshot taken");


    }


    }










