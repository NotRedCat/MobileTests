package tests;

import com.codeborne.selenide.Configuration;
import drivers.MobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class MobileTestBase {
    @BeforeAll
    public static void setup() {
        String host = System.getProperty("deviceHost");
        if (host.equals("localMobile")) {
            Configuration.browser = MobileDriver.class.getName();
        } else if (host.equals("realMobile")) {
            Configuration.browser = MobileDriver.class.getName();

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
        closeWebDriver();
    }
}
