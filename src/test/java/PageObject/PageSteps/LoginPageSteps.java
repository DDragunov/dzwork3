package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import utils.Configuration;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;
import static PageObject.PageElements.LoginPageElem.*;

public class LoginPageSteps {

    public static void openUrl(String url) {
        open(url);
    }

    public static void  authorization (){
        loginIcon.click();
        loginField.shouldBe(Condition.visible).sendKeys(Configuration.getConfigurationValue ("login"));
        passwordField.sendKeys(Configuration.getConfigurationValue("password"));
        loginBtn.shouldBe(Condition.enabled).click();

        String elemVal = assertElemPage.shouldBe(Condition.visible, Duration.ofSeconds(10) ).getText();
        Assertions.assertEquals(elemVal, "System Dashboard", "Ошибка открытия главной страницы");
    }
}
