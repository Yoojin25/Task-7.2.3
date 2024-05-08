package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Elements {
    public static SelenideElement searchField = $x("//input[@id='searchInput']");
    public static SelenideElement searchButton = $x("//button[@id='applySearchBtn']");
    public static SelenideElement firstProduct = $x("//div[@class='product-card-list']/article[1]");
    public static SelenideElement basketButton = $x("//div[@class='product-page__order-buttons']");
    public static SelenideElement goBasket = $x("//div[@class='product-page__order-buttons']");
    public static SelenideElement productNameOnPage = $x("//h1[@class='product-page__title']");
    public static SelenideElement productNameOnBasket = $x("//span[@class='good-info__good-name']");
}