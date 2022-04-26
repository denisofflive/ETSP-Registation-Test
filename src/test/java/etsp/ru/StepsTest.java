package etsp.ru;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class StepsTest {

    @Test
    public void testLambdaSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу etsp.ru", () -> {
            open("https://www.etsp.ru/");
        });
        step("Нажать на кнопку регистрация", () -> {
            $("span[id='lnkRegistration'] span:nth-child(2)").click();
        });
        step("Ввести фамилию", () -> {
            $("#LastName").setValue("Денисов");
        });
        step("Ввести имя", () -> {
            $("#FirstName").setValue("Денис");
        });
        step("Ввести отчество", () -> {
            $("#MiddleName").setValue("Олегович");
        });
        step("Выбрать страну Россия", () -> {
            $("button[title='Ничего не выбрано']").click();
            $("#bs-select-1-1").click();
        });
        step("Ввести мобильный номер телефона", () -> {
            $("#MobilePhone").setValue("9777777777");
        });
        step("Ввести логин", () -> {
            $("#Login").setValue("denisofflive@mail.ru");
        });
        step("Ввести пароль", () -> {
            $("#Password").setValue("1B3456789");
        });
        step("Подтвердить пароль", () -> {
            $("#PasswordConfirm").setValue("1B3456789");
        });
        step("Нажать на кнопку Зарегистрироваться", () -> {
            $x("//input[@value='Зарегистрироваться']").click();
        });

        sleep(2000);

    }
}
