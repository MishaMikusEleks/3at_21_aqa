package day_13;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import day_12.GoogleBOFactory;
import day_14.AllureListener;
import day_14.DriverProvider;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;


@Listeners(
        {UniversalVideoListener.class,
                AllureListener.class
        }
)
public class GooglePOFactoryVideoTest {


    @Test
    @Video
    void googleTest(){
        GoogleBOFactory googleBO=new GoogleBOFactory(DriverProvider.driver);
        googleBO
                .goToGoogle()
                .search("search Query Text")
                .printSearchResult()
                .clickFirstResult()
                .validateURLHost();
    }

    @Test
    void googleFiledTest(){
        GoogleBOFactory googleBO=new GoogleBOFactory(DriverProvider.driver);
        googleBO
                .goToGoogle()
                .search("search Query Text")
                .printSearchResult()
                .clickFirstResult()
                .validateURLHost()
                .failStep();
    }

    @AfterSuite
    void closeBrowser(){
        DriverProvider.driver.close();
        DriverProvider.driver.quit();
    }

}
