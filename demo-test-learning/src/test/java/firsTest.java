import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class firsTest {
	@Test
	void testdocker() {
//		Configuration.holdBrowserOpen = true;
		open("https://google.com");
		$("#W0wltc").click();
	}
}
