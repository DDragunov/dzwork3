package PageObject.PageSteps;

import PageObject.PageElements.MainPageElem;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;


public class MainPageSteps extends MainPageElem{
    public static void MainMetod(){
        projectMenu.shouldBe(visible, Duration.ofSeconds(60)).click();
        myProjectTEST.shouldBe(visible, Duration.ofSeconds(60)).click();
        fullListTask.shouldBe(visible, Duration.ofSeconds(60)).click();

        String numberTask=countAllTask.getText();//Вывод количества задач проекта в консоль
        System.out.println("Общее Количество задач в проекте: "+numberTask);

        searchField.shouldBe(visible,Duration.ofSeconds(60));
        searchField.setValue("TestSelenium_bug").pressEnter();//Поиск и переход к задаче TestSelenium_bug

        String nameTask=assertTaskName.getText();
        Assertions.assertEquals(nameTask, "TestSelenium_bug", "ошибка при открытии страницы задачи");

        String statusCheck=statusTask.getText();
        Assertions.assertEquals(statusCheck, "СДЕЛАТЬ", "Неверный статус");
        System.out.println("Статус задачи: "+statusCheck);

        String versionCheck=versionTask.getText();
        Assertions.assertEquals(versionCheck, "Version 2.0", "Неверная версия");
        System.out.println("Затронутая версия: "+versionCheck);
    }
}
