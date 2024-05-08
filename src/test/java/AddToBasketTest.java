import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.asserts.AssertAddToBasket;

import static com.codeborne.selenide.Condition.*;
import static steps.AddToBasketSteps.getElementText;
import static steps.AddToBasketSteps.openBrowser;
import static web_elements.Elements.*;

public class AddToBasketTest {

    @Test
    @DisplayName("Добавление товара в корзину")
    @Description("Товар добавляется в корзину")
    public void addToBasket() {

//      1. Открой главную страницу веб-сайта интернет-магазина Wildberries: https://www.wildberries.ru/.
        openBrowser();

//      2. Найди поле поиска на странице и введи в него название товара (например, "мобильный телефон").
        searchField.shouldBe(empty, interactable).setValue("мобильный телефон");

//      3. Нажми на кнопку "Поиск" или "Найти".
        searchButton.shouldBe(visible, interactable).click();

//      4. В результате поиска выбери первый товар из списка и кликни по нему, чтобы перейти на страницу товара.
        firstProduct.shouldBe(visible, enabled, clickable).click();

        String productNameOnPageText = getElementText(productNameOnPage);

//      5. Найди и кликни по кнопке "Добавить в корзину".
        basketButton.shouldBe(interactable, clickable).click();

//      6. Перейди в корзину и проверь, что товар добавился.
        goBasket.shouldBe(interactable, clickable).click();

        String productNameOnBasketText = getElementText(productNameOnBasket);

        AssertAddToBasket.textMatch(productNameOnPageText, productNameOnBasketText);
    }
}