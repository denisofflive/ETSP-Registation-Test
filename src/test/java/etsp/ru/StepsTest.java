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

        step("��������� ������� �������� etsp.ru", () -> {
            open("https://www.etsp.ru/");
        });
        step("������ �� ������ �����������", () -> {
            $("span[id='lnkRegistration'] span:nth-child(2)").click();
        });
        step("������ �������", () -> {
            $("#LastName").setValue("�������");
        });
        step("������ ���", () -> {
            $("#FirstName").setValue("�����");
        });
        step("������ ��������", () -> {
            $("#MiddleName").setValue("��������");
        });
        step("������� ������ ������", () -> {
            $("button[title='������ �� �������']").click();
            $("#bs-select-1-1").click();
        });
        step("������ ��������� ����� ��������", () -> {
            $("#MobilePhone").setValue("9777777777");
        });
        step("������ �����", () -> {
            $("#Login").setValue("denisofflive@mail.ru");
        });
        step("������ ������", () -> {
            $("#Password").setValue("1B3456789");
        });
        step("����������� ������", () -> {
            $("#PasswordConfirm").setValue("1B3456789");
        });
        step("������ �� ������ ������������������", () -> {
            $x("//input[@value='������������������']").click();
        });

        sleep(10000);

    }
}
