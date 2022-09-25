package PageObject.PageSteps;

import org.junit.jupiter.api.Assertions;
import PageObject.PageElements.TaskPageElem;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class TaskPageSteps extends TaskPageElem{
    public static void TaskPageStepsMethod(){

        allTask.click(); //нажали кнопку Задачи

        myTasks.shouldBe(visible, Duration.ofSeconds(60)).click(); //Перехоим в мои открутые задачи

        myTaskName.shouldBe(visible, Duration.ofSeconds(60)).click(); //Открываем нужную задачу

        btnInWork.shouldBe(visible, Duration.ofSeconds(60)).click();//Перевод статуса задачи в "В работе"

        sleep(1000);

        businesPr.shouldBe(visible, Duration.ofSeconds(60)).click();
        doneBtn.shouldBe(visible, Duration.ofSeconds(60)).click();//Перевод статуса задачи в "ГОТОВО"

        sleep(1000);

        String statusOK=statusTask.getText();
        Assertions.assertEquals(statusOK, "ГОТОВО", "ошибка");
    }
}
