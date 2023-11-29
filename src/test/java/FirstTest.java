import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Шорткаты 2 урок
public class FirstTest {
	@Test
	void shouldOpen() {
		String date = "29.11.23";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate localDate = LocalDate.parse(date, formatter);


		Assertions.assertEquals(LocalDate.EPOCH.getDayOfWeek(), 11);

	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
		}
	}


}
