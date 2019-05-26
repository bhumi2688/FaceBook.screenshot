import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Utils extends BasePage {


    //capture ScreenShot
   public static void captureScreenshot(String screenShotName){

       TakesScreenshot ts = (TakesScreenshot)driver;

        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(source, new File("./Screenshots/" +screenShotName +".png"));
            System.out.println("Screenshot Taken");
        }
        catch(IOException e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
      }

    }




}
