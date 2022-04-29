package day_11;

import day_11.bo.GoogleBO;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class GooglePOTest {
    private WebDriver driver;

    @BeforeTest
    void initDriver(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }

    @Test
    void googleTest(){
        GoogleBO googleBO=new GoogleBO(driver);
        googleBO
                .goToGoogle()
                .search("search Query Text")
                .printSearchResult()
                .clickFirstResult()
                .validateURL();
    }

    @AfterTest
    void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
