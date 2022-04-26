package etsp.ru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.etsp.ru/";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    public void fillFieldsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        //"Открываем главную страницу etsp.ru"
        open("https://www.etsp.ru/");
        // Нажать на кнопку регистрация
        $("span[id='lnkRegistration'] span:nth-child(2)").click();
        // Ввести фамилию
       $("#LastName").setValue("Денисов");
       // Ввести имя
       $("#FirstName").setValue("Денис");
       // Ввести отчество
       $("#MiddleName").setValue("Олегович");
       // Выбрать страну Россия
       $("button[title='Ничего не выбрано']").click();
       $("#bs-select-1-1").click();
       // Ввести мобильный номер телефона
       $("#MobilePhone").setValue("9777777777");
       // Ввести логин
       $("#Login").setValue("denisofflive@mail.ru");
       // Ввести пароль
       $("#Password").setValue("1B3456789");
       // Подтвердить пароль
       $("#PasswordConfirm").setValue("1B3456789");
       //$("recaptcha-checkbox-border").click();
        // Нажать на кнопку Зарегистрироваться
       // $x("//input[@value='Зарегистрироваться']").click();


      sleep(30000);

    }


}
