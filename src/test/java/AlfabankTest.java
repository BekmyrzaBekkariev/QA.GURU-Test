//import com.codeborne.selenide.SelenideElement;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.open;
//import static com.codeborne.selenide.Selenide.$;
//import com.codeborne.selenide.Configuration;
//
//
//
//
//public class AlfabankTest {
//	@Test
//	void testAlfa() {
//		Configuration.browser = "firefox";
//		Configuration.holdBrowserOpen = true;
//
//		open("https://alfabank.ru/");
//		$(byText("Вклады")).click();
//		$("body").shouldHave(text("Вкладки инвестиции"));
//		$(byText("Депозиты")).find(String.valueOf(visible)).click();
//		$(".product-cell__row_recharged").shouldHave(text("Высокий доход"));
//
//	}
//}
