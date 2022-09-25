
import hooks.WebHooks;
import org.junit.Test;
import utils.Configuration;
import org.junit.jupiter.api.*;

        import static com.codeborne.selenide.Selenide.open;
        import static PageObject.PageSteps.LoginPageSteps.*;

        import com.codeborne.selenide.SelenideElement;
        import static com.codeborne.selenide.Selenide.$x;

        public class testDZ extends WebHooks {

        @Test
        public void Test_1(){
        //openUrl(getConfigurationValue("jiraUrl"));
        open(Configuration.getConfigurationValue("jiraUrl"));
        //authorization(getConfigurationValue("login"));
        }
        }