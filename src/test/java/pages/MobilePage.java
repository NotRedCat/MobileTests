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
        $(AppiumBy.id("ru.citilink:id/profile_graph"))
                .click();
        return this;
    }

    public MobilePage checkingUserIsNotRegistration() {
        $$(AppiumBy.id("ru.citilink:id/textViewHeader"))
                .shouldHave(CollectionCondition.texts("Войдите\n" +
                        "или зарегистрируйтесь"));
        return this;
    }

    public MobilePage goToAuthorisationByEmail() {
        $(AppiumBy.id("ru.citilink:id/buttonProfileGuestHeaderAuth"))
                .click();
        $(AppiumBy.id("ru.citilink:id/buttonAuthPhoneAuthByPassword"))
                .click();
        return this;
    }

    public MobilePage checkingAuthorisationByEmail() {
        $$(AppiumBy.className("android.widget.TextView"))
                .shouldHave(CollectionCondition.texts("Вход по паролю"));
        return this;
    }

    public MobilePage setUsername(String username) {
        $(AppiumBy.id("ru.citilink:id/editTextAuthPasswordLogin"))
                .sendKeys(username);
        return this;
    }

    public MobilePage setPassword(String password) {
        $(AppiumBy.id("ru.citilink:id/editTextAuthPasswordPass"))
                .sendKeys(password);
        return this;
    }

    public MobilePage clickOnTheAuthButton() {
        $(AppiumBy.id("ru.citilink:id/buttonAuthPassword"))
                .click();
        return this;
    }

    public MobilePage checkingAuthorisationFailed() {
        $$(AppiumBy.id("ru.citilink:id/snackbar_text"))
                .shouldHave(CollectionCondition.texts("Неверный логин или пароль"));
        return this;
    }

    public MobilePage checkingThatFavoritesIsEmpty() {
        $(AppiumBy.id("ru.citilink:id/favorite_products_graph"))
                .click();
        $$(AppiumBy.id("ru.citilink:id/textEmptyTitle"))
                .shouldHave(CollectionCondition.texts("В избранном пока пусто"));
        return this;
    }

    public MobilePage searchAndAddProductInFavorites() {
        $(AppiumBy.id("ru.citilink:id/mainCategoriesFragment"))
                .click();
        $(AppiumBy.id("ru.citilink:id/buttonSearch"))
                .click();
        $(AppiumBy.id("ru.citilink:id/editTextSearchToolbar"))
                .sendKeys("honor");
        $(AppiumBy.id("ru.citilink:id/textViewSearchProductName"))
                .click();
        return this;
    }

    public MobilePage checkingThatFavoritesIsNotEmpty() {
        $(AppiumBy.id("ru.citilink:id/favorite"))
                .click();
        $(AppiumBy.id("ru.citilink:id/favorite_products_graph"))
                .shouldHave(attribute("content-desc", "Избранное, 1 new notification"));
        return this;
    }

    public MobilePage checkingThatCartIsEmpty() {
        $(AppiumBy.id("ru.citilink:id/ordering_graph"))
                .click();
        $$(AppiumBy.id("ru.citilink:id/textEmptyTitle"))
                .shouldHave(CollectionCondition.texts("Ваша корзина пуста"));
        return this;
    }

    public MobilePage searchAndAddProductInCart() {
        $(AppiumBy.id("ru.citilink:id/mainCategoriesFragment"))
                .click();
        $(AppiumBy.id("ru.citilink:id/buttonSearch"))
                .click();
        $(AppiumBy.id("ru.citilink:id/editTextSearchToolbar"))
                .sendKeys("honor");
        $(AppiumBy.id("ru.citilink:id/textViewSearchProductName"))
                .click();
        $(AppiumBy.id("ru.citilink:id/buttonProductAddToCart"))
                .click();

        return this;
    }

    public MobilePage checkingThatCartIsNotEmpty() {
        $(AppiumBy.id("ru.citilink:id/ordering_graph"))
                .shouldHave(attribute("content-desc", "Корзина, 1 new notification"));
        return this;
    }


}
