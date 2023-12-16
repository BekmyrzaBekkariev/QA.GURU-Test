import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.asynchttpclient.Response;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Selenide;

public class SelenideRepositorySearch {
	// Сюжет
	// Открыть главную страницу
	// вести в поле поисках selenide и нажать на enter
	// кликнуть на первый репозиторий из списка найденных
	// проверка: заголовок selenide

	@Test
	void SeleniudeTest() {
		Configuration.browser = "firefox";
		Configuration.holdBrowserOpen = true;
		open("https://github.com/");
		// $(".search-input").shouldHave(text("Search or jump to..."));
		$(".search-input").click();
		$("#query-builder-test").setValue("selenide").pressEnter();
		$(".Link__StyledLink-sc-14289xe-0.GCHqa").click();
		$(".mr-2.flex-self-stretch").shouldHave(text("selenide"));

 		// Если такой класс или ид то Link__StyledLink-sc-14289xe-0 GCHqa - то где пропуск
		// Нужно обязательно соединить точкой




	}
}
