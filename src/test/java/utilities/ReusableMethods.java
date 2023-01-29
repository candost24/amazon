package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenShot(WebDriver driver, String name) throws IOException {
        //Screenshot dosya ismi için şuanki tarih string olarak alıyoruz
        String date = formatCurrentDate("yyyyMMddhhmmss");

        //Screen shot alıp file objesine atıyoruz
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //kaydedeilecek dosyanın yolunu belirliyoruz
        String target = System.getProperty("user.dir")+"\\test-output\\Screenshots\\" + name + date + ".png";

        File targetFile = new File(target);

        // kaynağı hedefe kopyalıyoruz
        FileUtils.copyFile(source,targetFile);

        return target;
    }
    public static String formatCurrentDate(String pattern){
      return   new SimpleDateFormat(pattern).format(new Date());
    }
}