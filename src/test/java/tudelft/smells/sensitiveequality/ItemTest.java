package tudelft.smells.sensitiveequality;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ItemTest {

	@Test @Disabled
	void qtyTimesIndividualPrice() {
		var item = new Item("Playstation IV with 64 GB and super wi-fi",
				3,
				new BigDecimal("599.99"));

		// this is too sensitive!
		Assertions.assertEquals("Product Playstation IV with 64 GB " +
				"and super wi-fi times " + 3 + " = 1799.97", item.toString());
	}

	@Test
	void qtyTimesIndividualPrice_lessSensitiveAssertion() {
		var item = new Item("Playstation IV with 64 GB and super wi-fi",
				3,
				new BigDecimal("599.99"));

		Assertions.assertEquals(new BigDecimal("1799.97"), item.finalAmount());
	}
}
