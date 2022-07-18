package PageObject.Selectors;

import org.openqa.selenium.By;

public class Selectors {
    //кнопка заказать в верхней части страницы
    public static By orderButtonTop = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    //кнопка заказать в нижней части страницы
    public static By orderButtonDown = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");
    //кнопка принятия кук
    public static By buttonCookie = By.xpath(".//button[text()='да все привыкли']");
    //заголовок формы заказа
    public static By headerOrder = By.className("Order_Header__BZXOb");

    //селекторы формы заказа:
    //селектор поля ввода имени в заказ
    public static By fieldOrderName = By.xpath(".//input[@placeholder='* Имя']");
    //селектор поля ввода фамилии в заказ
    public static By fieldOrderSurName = By.xpath(".//input[@placeholder='* Фамилия']");
    //селектор поля ввода адреса в заказ
    public static By fieldOrderAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //селектор поля ввода станции метро в заказ
    public static By fieldOrderSelectMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    //селектор поля ввода телефона в заказ
    public static By fieldOrderTelephoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //селектор кнопки "Далее" на первой странице заказа
    public static By buttonTheNextInOrder = By.xpath(".//button[text()='Далее']");
    //селектор поля ввода даты заказа
    public static By fieldOrderDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //селектор поля ввода продолжительности аренды
    public static By fieldOrderDurationRentalDropDownArrow = By.xpath(".//span[@class='Dropdown-arrow']");
    //селектор поля ввода комментариев для курьера
    public static By fieldOrderComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //селектор кнопка "Заказать" в форме заказа
    public static By buttonFinishOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //селектор кнопка "Да" в форме заказа
    public static By buttonFinishOrderYes = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    //селектор кнопка "Нет" в форме заказа
    public static By buttonFinishOrderNo = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Нет']");
    //селектор заголовка "Заказ оформлен" в форме заказа
    public static By titleOrderHasBeenPlaced = By.xpath(".//div[text()='Заказ оформлен']");

    //селекторы FAQ:
    //Селектор вопроса "Сколько это стоит? И как оплатить?" и ответ на него
    public static By questionPayment = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']");
    public static By questionPaymentSpoiler = By.xpath(".//p[contains(text(), 'Сутки — 400 рублей.')]");
    //Селектор вопроса "Хочу сразу несколько самокатов! Так можно?" и ответ на него
    public static By moreScooters = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    public static By moreScootersSpoiler = By.xpath(".//p[contains(text(), 'Пока что у нас так: один заказ — один самокат.')]");
    //Селектор вопроса "Как рассчитывается время аренды?" и ответ на него
    public static By rentalTime = By.xpath(".//div[text()='Как рассчитывается время аренды?']");
    public static By rentalTimeSpoiler = By.xpath(".//p[contains(text(), 'Допустим, вы оформляете заказ на 8 мая.')]");
    //Селектор вопроса "Можно ли заказать самокат прямо на сегодня?" и ответ на него
    public static By scooterToDay = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    public static By scooterToDaySpoiler = By.xpath(".//p[contains(text(), 'Только начиная с завтрашнего дня.')]");
    //Селектор вопроса "Можно ли продлить заказ или вернуть самокат раньше?" и ответ на него
    public static By rentalExtend = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    public static By rentalExtendSpoiler = By.xpath(".//p[contains(text(), 'Пока что нет! Но если что-то срочное')]");
    //Селектор вопроса "Вы привозите зарядку вместе с самокатом?" и ответ на него
    public static By chargerScooter = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");
    public static By chargerScooterSpoiler = By.xpath(".//p[contains(text(), 'Самокат приезжает к вам с полной зарядкой.')]");
    //Селектор вопроса "Можно ли отменить заказ?" и ответ на него
    public static By cancelOrder = By.xpath(".//div[text()='Можно ли отменить заказ?']");
    public static By cancelOrderSpoiler = By.xpath(".//p[contains(text(), 'Да, пока самокат не привезли.')]");
    //Селектор вопроса "Я жизу за МКАДом, привезёте?" и ответ на него (синтаксическая ошибка сохранена)
    public static By scooterForMKAD = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");
    public static By scooterForMKADSpoiler = By.xpath(".//p[contains(text(), 'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]");
}
