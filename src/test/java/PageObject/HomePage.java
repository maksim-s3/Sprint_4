package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObject.Selectors.Selectors;

public class HomePage {
    WebDriver driver;

    HomePage(WebDriver driver){
        this.driver = driver;
    }

    void clickButtonCookie(){
        driver.findElement(Selectors.buttonCookie).click();
    }

    void waitForLoadHomePage(){
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("root")));
    }

    boolean openQuestion(WebElement element, By selector){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return driver.findElement(selector).isDisplayed();
    }

    boolean openQuestionPayment(){
        WebElement element = driver.findElement(Selectors.questionPayment);
        return openQuestion(element, Selectors.questionPaymentSpoiler);
    }
    boolean openQuestionMoreScooters(){
        WebElement element = driver.findElement(Selectors.moreScooters);
        return openQuestion(element, Selectors.moreScootersSpoiler);
    }
    boolean openQuestionRentalTime(){
        WebElement element = driver.findElement(Selectors.rentalTime);
        return openQuestion(element, Selectors.rentalTimeSpoiler);
    }
    boolean openQuestionScooterToDay(){
        WebElement element = driver.findElement(Selectors.scooterToDay);
        return openQuestion(element, Selectors.scooterToDaySpoiler);
    }
    boolean openQuestionRentalExtend(){
        WebElement element = driver.findElement(Selectors.rentalExtend);
        return openQuestion(element, Selectors.rentalExtendSpoiler);
    }
    boolean openQuestionChargerScooter(){
        WebElement element = driver.findElement(Selectors.chargerScooter);
        return openQuestion(element, Selectors.chargerScooterSpoiler);
    }
    boolean openQuestionCancelOrder(){
        WebElement element = driver.findElement(Selectors.cancelOrder);
        return openQuestion(element, Selectors.cancelOrderSpoiler);
    }
    boolean openQuestionScooterForMKAD(){
        WebElement element = driver.findElement(Selectors.scooterForMKAD);
        return openQuestion(element, Selectors.scooterForMKADSpoiler);
    }

    void clickButtonOrderTop(){
        driver.findElement(Selectors.orderButtonTop).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(Selectors.headerOrder));
    }

    void clickButtonOrderDown(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", driver.findElement(Selectors.orderButtonDown));
        driver.findElement(Selectors.orderButtonDown).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(Selectors.headerOrder));
    }

    void setFieldOrderName(String name){
        driver.findElement(Selectors.fieldOrderName).sendKeys(name);
    }
    void setFieldOrderSurName(String surName){
        driver.findElement(Selectors.fieldOrderSurName).sendKeys(surName);
    }
    void setFieldOrderAddress(String address){
        driver.findElement(Selectors.fieldOrderAddress).sendKeys(address);
    }
    void setFieldOrderSelectMetroStation(String metroStation){
        WebElement element = driver.findElement(Selectors.fieldOrderSelectMetroStation);
        element.click();
        element.sendKeys(metroStation);
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.ENTER);
    }
    void setFieldOrderTelephoneNumber(String telephoneNumber){
        driver.findElement(Selectors.fieldOrderTelephoneNumber).sendKeys(telephoneNumber);
    }
    void clickButtonTheNextInOrder(){
        driver.findElement(Selectors.buttonTheNextInOrder).click();
    }
    void setFieldOrderDate(String date){
        driver.findElement(Selectors.fieldOrderDate).sendKeys(date);
        driver.findElement(Selectors.fieldOrderDate).sendKeys(Keys.ENTER);
    }
    void setFieldOrderDurationRental(String rentalDays){
        driver.findElement(Selectors.fieldOrderDurationRentalDropDownArrow).click();
        driver.findElement(By.xpath(".//div[@class='Dropdown-menu']/div[text()='"+rentalDays+"']")).click();
    }
    void setFieldOrderCheckboxColorScooter(String colorScooter){
        driver.findElement(By.xpath(".//label[text()='"+colorScooter+"']/input")).click();
    }
    void setFieldOrderComment(String comment){
        driver.findElement(Selectors.fieldOrderComment).sendKeys(comment);
    }
    void clickButtonOrderFinish(){
        driver.findElement(Selectors.buttonFinishOrder).click();
    }
    void clickButtonOrderFinishYes(){
        driver.findElement(Selectors.buttonFinishOrderYes).click();
    }
    boolean shouldBeTitleOrderHasBeenPlaced(){
        return driver.findElement(Selectors.titleOrderHasBeenPlaced).isDisplayed();
    }
}
