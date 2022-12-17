package tests;

import org.junit.jupiter.api.Test;
import pages.MobilePage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class MobileTests extends MobileTestBase {
    MobilePage mobilePage = new MobilePage();

    @Test
    void checkUnregistration() {
        step("Подтверждение города", () ->
                mobilePage.acceptCity());
        step("Переход в профиль,проверка, что пользователь не авторизован", () ->
                mobilePage.
                        goToProfile()
                        .checkingUserIsNotRegistration());
        step("Переход на страницу авторизации", () ->
                mobilePage.goToAuthorisationByEmail()
                        .checkingAuthorisationByEmail());
        step("Проверка, что при авторизии с неверными логином и паролем, возникает ошибка", () ->
                mobilePage.setUsername(username)
                        .setPassword(password)
                        .clickOnTheAuthButton()
                        .checkingAuthorisationFailed());
    }

    @Test
    void addProductToFavorite() {
        open();
        step("Подтверждение города", () ->
                mobilePage.acceptCity());
        step("Проверка, что в избранном пусто", () ->
                mobilePage.checkingThatFavoritesIsEmpty());
        step("Находжение и добавление товара в избранное", () ->
                mobilePage.searchAndAddProductInFavorites());
        step("Проверка, что в избранном появился товар", () ->
                mobilePage.checkingThatFavoritesIsNotEmpty());
    }

    @Test
    void addProductToCard() {
        open();
        step("Подтверждение города", () ->
                mobilePage.acceptCity());
        step("Проверка, что в корзине пусто", () ->
                mobilePage.checkingThatCartIsEmpty());
        step("Находжение и добавление товара в корзину", () ->
                mobilePage.searchAndAddProductInCart());
        step("Проверка, что в корзине появился товар", () ->
                mobilePage.checkingThatCartIsNotEmpty());
    }
}
