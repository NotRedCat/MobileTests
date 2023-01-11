package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import pages.MobilePage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class MobileTests extends MobileTestBase {
    MobilePage mobilePage = new MobilePage();

    @Test
    void checkUnregistration() {
        open();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"))
                .click();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"))
                .sendKeys("Anastasiaredcat@gmail.com");
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"))
                .click();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"))
                .sendKeys("Ku!123456");
        $(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Войти\"]"))
                .click();
        $(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Главная\"]"))
                .click();

        $(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Уведомления\"]"))
                .click();
        $(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"ТС\"]"))
                .click();
        $(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Планы\"]"))
                .click();
        $(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Чаты\"]"))
                .click();
       // $$(AppiumBy.id("ru.citilink:id/textEmptyTitle"))
            //    .shouldHave(CollectionCondition.texts("В избранном пока пусто"));

    }
}