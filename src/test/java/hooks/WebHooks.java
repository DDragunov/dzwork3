package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

public class WebHooks {
    @BeforeAll
    public static void SetWebDriver()
    {
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void CloseWebDriver()//закрываем драйвер после каждого теста
    {
        WebDriverRunner.closeWebDriver();
    }
}
