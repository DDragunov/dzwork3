package PageObject.PageSteps;

import static PageObject.PageSteps.MainPageSteps.*;
import static PageObject.PageElements.TaskCreatePageElem.*;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;

public class TaskCreatePageSteps {
    public static void TaskCreateStepsMethod(){

        newTaskBag.click();

        typeTask.shouldBe(visible, Duration.ofSeconds(60)).click();
        typeTask.sendKeys("Ошибка");
        typeTask.pressEnter();

        themeTask.setValue("Ошибка окна программы");

        setDescriptionText("Окно программы открывается неверно", descriptionTask);

        versionEdit.scrollIntoView(true).click();

        setDescriptionText("Операционная система: Windows", environTask);

        versionTouch.scrollIntoView(true).click(); //Выбрать затронутая версия

        taskWorkMy.click();//Назначить меня

        btnCreate.click();

    }

}
