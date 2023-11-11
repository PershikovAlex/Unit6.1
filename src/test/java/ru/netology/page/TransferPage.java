package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.valueOf;

public class TransferPage {
    //private SelenideElement firstCardField = $("[data-test-id=92df3f1c-a033-48e6-8390-206f6b1f56c0]");
    //private SelenideElement secondCardField = $("[data-test-id=0f3f5c2a-249e-4c3d-8287-09f7a039391d]");
    private SelenideElement firstCardButton = $("[data-test-id=92df3f1c-a033-48e6-8390-206f6b1f56c0] .button__text");
    private SelenideElement secondCardButton = $("[data-test-id=0f3f5c2a-249e-4c3d-8287-09f7a039391d] .button__text");
    private SelenideElement reloadButton = $("[data-test-id=action-reload] .button__text");
    private SelenideElement amountField = $("[data-test-id=amount] input");
    private SelenideElement from = $("[data-test-id=from] input");
    private SelenideElement amountButton = $("data-test-id=action-transfer");

    public DashboardPage makeValidTransfer(String amount, DataHelper.CardInfo cardInfo) {
        makeTransfer(amount, cardInfo);
        return new DashboardPage();
    }

    public DashboardPage makeTransfer(String amount, DataHelper.CardInfo cardInfo) {
        amountField.setValue(valueOf(amount));
        from.setValue(cardInfo.getNumberCard());
        amountButton.click();
    }
}
