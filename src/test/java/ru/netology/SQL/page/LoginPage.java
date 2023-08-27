package ru.netology.SQL.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.netology.SQL.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {


        private static final SelenideElement loginField = $("[data-test-id=login] input");



        private static final  SelenideElement passwordField = $("[data-test-id=password] input");


        private static final SelenideElement loginButton = $("[data-test-id=action-login]");


        private static final SelenideElement errorNotification = $("[data-test-id='error-notification']");


        public void verifyErrorNotificationVisibility(){
            errorNotification.shouldBe(visible);

        }
        public static VerificationPage validLogin(DataHelper.AuthInfo info){
            loginField.setValue(info.getLogin());
            passwordField.setValue(info.getPassword());
            loginButton.click();
            return new VerificationPage();

        }




    }

