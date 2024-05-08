package steps;

import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;

public class AddToBasketSteps {

    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();

        open("https://www.wildberries.ru/");
    }

    public static String getElementText(SelenideElement element) {
        return element.shouldBe(exist).getText();
    }
}