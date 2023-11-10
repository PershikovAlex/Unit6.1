package ru.netology.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import java.util.Calendar;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[data-test-id=login] input");
    private SelenideElement passwordFieled = $("[data-test-id=password] input");
    private SelenideElement loginButton = $("[data-test-id=action-login]");
    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordFieled.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }

}
