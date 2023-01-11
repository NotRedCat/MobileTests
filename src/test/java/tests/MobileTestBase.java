package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.MobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;

public class MobileTestBase {
    String username = "Citilink@mail.ru",
            password = "Citilink@mail.ru";

    @BeforeAll
    public static void setup() throws Exception {

        //String deviceHost = System.getProperty("deviceHost");
        String deviceHost = "realMobile";
        if (deviceHost.equals("localMobile")) {
            Configuration.browser = MobileDriver.class.getName();

        } else if (deviceHost.equals("realMobile")) {
            Configuration.browser = MobileDriver.class.getName();

        } else {
            throw new Exception("Неверное окружение");
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();

    }

    @AfterEach
    public void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        step("Close driver", Selenide::closeWebDriver);
    }
}
