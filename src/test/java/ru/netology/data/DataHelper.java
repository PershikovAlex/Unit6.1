package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    public static CardInfo getFirstCardNumber() {
        return new CardInfo("5559 0000 0000 0001");
    }

    public static CardInfo getSecondCardNumber() {
        return new CardInfo("5559 0000 0000 0002");
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    @Value
    public static class CardInfo {
        String cardNumber;
    }
}
