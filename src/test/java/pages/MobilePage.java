package pages;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class MobilePage {
    public MobilePage acceptCity() {
        $$(AppiumBy.id("android:id/button1"))
                .shouldHave(texts("ДА")).first().click();
        return this;
    }

    public MobilePage goToProfile() {
        $$(AppiumBy.id("ru.citilink:id/profile_graph"))
                .first().click();
        return this;
    }

    public MobilePage checkingUserIsNotRegistration() {
        $$(AppiumBy.id("ru.citilink:id/textViewHeader"))
                .shouldHave(CollectionCondition.texts("Войдите\n" +
                        "или зарегистрируйтесь"));
        return this;
    }

    public MobilePage goToAuthorisationByEmail() {
        $$(AppiumBy.id("ru.citilink:id/buttonProfileGuestHeaderAuth"))
                .first().click();
        $$(AppiumBy.id("ru.citilink:id/buttonAuthPhoneAuthByPassword"))
                .first().click();
        return this;
    }

    public MobilePage checkingAuthorisationByEmail() {
        $$(AppiumBy.className("android.widget.TextView"))
                .shouldHave(CollectionCondition.texts("Вход по паролю"));
        return this;
    }

    public MobilePage incorrectUsernameAndPassword() {
        $(AppiumBy.id("ru.citilink:id/editTextAuthPasswordLogin"))
                .sendKeys("Citilink@mail.ru");
        $(AppiumBy.id("ru.citilink:id/editTextAuthPasswordPass"))
                .sendKeys("Citilink@mail.ru");
        $$(AppiumBy.id("ru.citilink:id/buttonAuthPassword"))
                .first().click();
        return this;
    }

    public MobilePage checkingAuthorisationFailed() {
        $(AppiumBy.id("ru.citilink:id/editTextAuthPasswordLogin"))
                .sendKeys("Citilink@mail.ru");
        $(AppiumBy.id("ru.citilink:id/editTextAuthPasswordPass"))
                .sendKeys("Citilink@mail.ru");
        $$(AppiumBy.id("ru.citilink:id/buttonAuthPassword"))
                .first().click();
        return this;
    }

    public MobilePage checkingThatFavoritesIsEmpty() {
        $$(AppiumBy.id("ru.citilink:id/favorite_products_graph"))
                .first().click();
        $$(AppiumBy.id("ru.citilink:id/textEmptyTitle"))
                .shouldHave(CollectionCondition.texts("В избранном пока пусто"));
        return this;
    }

    public MobilePage searchAndAddProductInFavorites() {
        $$(AppiumBy.id("ru.citilink:id/mainCategoriesFragment"))
                .first().click();
        $(AppiumBy.id("ru.citilink:id/buttonSearch"))
                .click();
        $(AppiumBy.id("ru.citilink:id/editTextSearchToolbar"))
                .sendKeys("honor");
        $$(AppiumBy.id("ru.citilink:id/textViewSearchProductName"))
                .first().click();
        return this;
    }

    public MobilePage checkingThatFavoritesIsNotEmpty() {
        $$(AppiumBy.id("ru.citilink:id/favorite"))
                .first().click();
        $(AppiumBy.id("ru.citilink:id/favorite_products_graph"))
                .shouldHave(attribute("content-desc", "Избранное, 1 new notification"));
        return this;
    }

    public MobilePage checkingThatCartIsEmpty() {
        $$(AppiumBy.id("ru.citilink:id/ordering_graph"))
                .first().click();
        $$(AppiumBy.id("ru.citilink:id/textEmptyTitle"))
                .shouldHave(CollectionCondition.texts("Ваша корзина пуста"));
        return this;
    }

    public MobilePage searchAndAddProductInCart() {
        $$(AppiumBy.id("ru.citilink:id/mainCategoriesFragment"))
                .first().click();
        $(AppiumBy.id("ru.citilink:id/buttonSearch"))
                .click();
        $(AppiumBy.id("ru.citilink:id/editTextSearchToolbar"))
                .sendKeys("honor");
        $$(AppiumBy.id("ru.citilink:id/textViewSearchProductName"))
                .first().click();
        $$(AppiumBy.id("ru.citilink:id/buttonProductAddToCart"))
                .first().click();
        return this;
    }

    public MobilePage checkingThatCartIsNotEmpty() {
        $(AppiumBy.id("ru.citilink:id/ordering_graph"))
                .shouldHave(attribute("content-desc", "Корзина, 1 new notification"));
        return this;
    }


}
