package PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestOrder {
    private WebDriver driver;
    private HomePage objHomePage;
    String name;
    String surName;
    String address;
    String metroStation;
    String telephoneNumber;
    String date;
    String rentalDays;
    String colorScooter;
    String comment;
    boolean expected;

    public TestOrder(WebDriver driver, String name, String surName, String address, String metroStation,
                     String telephoneNumber, String date, String rentalDays, String colorScooter, String comment, boolean expected) {
        this.driver = driver;
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.metroStation = metroStation;
        this.telephoneNumber = telephoneNumber;
        this.date = date;
        this.rentalDays = rentalDays;
        this.colorScooter = colorScooter;
        this.comment = comment;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                //{new FirefoxDriver(), "Максим", "Старцев", "Бакалинская 12", "Речной вокзал", "89191234567", "20.07.2022", "сутки", "чёрный жемчуг", "Буду у метро",true},
                {new ChromeDriver(), "Максим", "Старцев", "Бакалинская 12", "Речной вокзал", "89191234567", "20.07.2022", "сутки", "чёрный жемчуг", "Буду у метро",true},
                //{new FirefoxDriver(), "Максим", "Старцев", "Пресненская 32", "Парк Победы", "89191234567", "4.08.2022", "двое суток", "серая безысходность", "Буду в черном плаще", true},
                {new ChromeDriver(), "Максим", "Старцев", "Пресненская 32", "Парк Победы", "71234567896", "4.08.2022", "двое суток", "серая безысходность", "Буду в черном плаще", true},
        };
    }


    @Before
    public void setUp(){
        objHomePage = new HomePage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objHomePage.waitForLoadHomePage();
        objHomePage.clickButtonCookie();
    }

    @Test
    public void testOrderButtonTop(){
        objHomePage.clickButtonOrderTop();
        objHomePage.setFieldOrderName(name);
        objHomePage.setFieldOrderSurName(surName);
        objHomePage.setFieldOrderAddress(address);
        objHomePage.setFieldOrderSelectMetroStation(metroStation);
        objHomePage.setFieldOrderTelephoneNumber(telephoneNumber);
        objHomePage.clickButtonTheNextInOrder();
        objHomePage.setFieldOrderDate(date);
        objHomePage.setFieldOrderDurationRental(rentalDays);
        objHomePage.setFieldOrderCheckboxColorScooter(colorScooter);
        objHomePage.setFieldOrderComment(comment);
        objHomePage.clickButtonOrderFinish();
        objHomePage.clickButtonOrderFinishYes();
        boolean actual = objHomePage.shouldBeTitleOrderHasBeenPlaced();
        assertEquals("The order was not placed", expected, actual);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
