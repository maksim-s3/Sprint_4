package PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class TestQuestions {
    private WebDriver driver;
    private HomePage objHomePage;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        objHomePage = new HomePage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testQuestionPayment(){
        assertTrue("Element not displaying", objHomePage.openQuestionPayment());
    }

    @Test
    public void testQuestionMoreScooters(){
        assertTrue("Element not displaying", objHomePage.openQuestionMoreScooters());
    }

    @Test
    public void testQuestionRentalTime(){
        assertTrue("Element not displaying", objHomePage.openQuestionRentalTime());
    }

    @Test
    public void testQuestionScooterToDay(){
        assertTrue("Element not displaying", objHomePage.openQuestionScooterToDay());
    }

    @Test
    public void testQuestionRentalExtend(){
        assertTrue("Element not displaying", objHomePage.openQuestionRentalExtend());
    }

    @Test
    public void testQuestionChargerScooter(){
        assertTrue("Element not displaying", objHomePage.openQuestionChargerScooter());
    }

    @Test
    public void testQuestionCancelOrder(){
        assertTrue("Element not displaying", objHomePage.openQuestionChargerScooter());
    }

    @Test
    public void testQuestionScooterForMKAD(){
        assertTrue("Element not displaying", objHomePage.openQuestionScooterForMKAD());
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
