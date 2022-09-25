package PageObject.TestJira;

import hooks.WebHooks;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import utils.Configuration;
import static PageObject.PageSteps.LoginPageSteps.*;
import static PageObject.PageSteps.MainPageSteps.*;
import static PageObject.PageSteps.TaskCreatePageSteps.*;
import static PageObject.PageSteps.TaskPageSteps.*;


public class dzTestJira extends WebHooks {

    @Test
    @Tag("GUI")
    @DisplayName(" Проверка авторизации на сайте JIRA")
    public void Test_1(){
        openUrl(Configuration.getConfigurationValue("jiraUrl"));
        authorization();
    }

    @Test
    @Tag("GUI")
    @DisplayName(" Открыть задачу и проверка ее данных")
    public void Test_2(){
        openUrl(Configuration.getConfigurationValue("jiraUrl"));
        authorization();
        MainMetod();
    }

    @Test
    @Tag("GUI")
    @DisplayName(" Создание задачи")
    public void Test_3(){
        openUrl(Configuration.getConfigurationValue("jiraUrl"));
        authorization();
        MainMetod();
        TaskCreateStepsMethod();
    }

    @Test
    @Tag("GUI")
    @DisplayName(" Смена статуса задачи")
    public void Test_4(){
        openUrl(Configuration.getConfigurationValue("jiraUrl"));
        authorization();
        MainMetod();
        TaskCreateStepsMethod();
        TaskPageStepsMethod();
    }
}
