package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement firstCardField = $("[data-test-id=92df3f1c-a033-48e6-8390-206f6b1f56c0]");
    private SelenideElement secondCardField = $("[data-test-id=0f3f5c2a-249e-4c3d-8287-09f7a039391d]");
    private SelenideElement firstCardButton = $("[data-test-id=92df3f1c-a033-48e6-8390-206f6b1f56c0] .button__text");
    private SelenideElement secondCardButton = $("[data-test-id=0f3f5c2a-249e-4c3d-8287-09f7a039391d] .button__text");
    private SelenideElement reloadButton = $("[data-test-id=action-reload] .button__text");
    public TransferPage() {
        firstCardButton.click();
        secondCardButton.click();
        reloadButton.click();
    }
}
