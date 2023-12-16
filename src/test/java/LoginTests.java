import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.openqa.selenium.remote.http.ConnectionFailedException.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {

	/** Сейчас мы сделаем вот эти тесты.
	 * Открыть форму авторизации.
	 * https://qa.guru/cms/system/login
	 * Ввести адрес электронной почты
	 * Вести пароль
	 * Нажать на кнопку "Войти. "
	 * Нажать на кнопку "Личный кабинет"
	 * Проверить успешную авторизацию.*/

	// Авто тест на успешную авторизацию
	@Test
	void successfulLoginTest() {
		Configuration.browser="firefox";
//		Configuration.timeout=1000;

		Configuration.holdBrowserOpen = true;
		open("https://qa.guru/cms/system/login");
		$(".login-form").shouldHave(text("Войти"));

		$("[name=email] ").setValue("bekmyrzabekkariev05@gmail.com");
		$("[name=password]").setValue("DceAS6+-4").pressEnter();

		$("[class=arrow-min]").click();
	}

	// Авто тест на НЕ успешную авторизацию

	@Test
	void unseccessfulLogin() {

	}
}