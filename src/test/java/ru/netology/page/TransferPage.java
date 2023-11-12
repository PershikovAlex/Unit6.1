package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.valueOf;

public class TransferPage {

    private SelenideElement amountField = $("[data-test-id=amount] input");
    private SelenideElement from = $("[data-test-id=from] input");
    private SelenideElement amountButton = $("[data-test-id=action-transfer]");
    private SelenideElement errorMassage = $("[data-test-id=error-massage]");

    public void makeTransfer(String amount, DataHelper.CardInfo cardInfo) {
        amountField.setValue(valueOf(amount));
        from.setValue(cardInfo.getNumberCard());
        amountButton.click();
    }

    public DashboardPage makeValidTransfer(String amount, DataHelper.CardInfo cardInfo) {
        makeTransfer(amount, cardInfo);
        return new DashboardPage();
    }

    public void findErrorMassage(String expectedText) {
        errorMassage.shouldHave(exactText(expectedText), Duration.ofSeconds(15)).shouldBe(visible);
    }
}
