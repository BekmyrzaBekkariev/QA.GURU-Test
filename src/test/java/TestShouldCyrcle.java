import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestShouldCyrcle {
	@Test
	void JustTestCyrcle() throws InterruptedException {

		// Configuration.browserSize = "800x400";

		Configuration.browser = "firefox";
		Configuration.holdBrowserOpen = true;
		open("https://github.com/selenide/selenide");
		$("div.Layout-sideba" +
						"r div.BorderGrid-row ul.list-style-none.d-flex.flex-wrap.mb-n2 li.mb-2.mr-2 a[href='https" +
						"://github.com/asolntsev']").click();



	}
}
