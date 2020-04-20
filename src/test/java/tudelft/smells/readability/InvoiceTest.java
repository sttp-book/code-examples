package tudelft.smells.readability;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {

	@Test
	void test1() {
		var invoice = new Invoice(new BigDecimal("2500"), "NL", CustomerType.COMPANY);

		var v = invoice.calculate();

		assertEquals(250, v.doubleValue(), 0.0001);

	}

	@Test
	void taxesForCompanies() {
		var invoice = new InvoiceBuilder()
				.asCompany()
				.withCountry("NL")
				.withAValueOf("2500")
				.build();

		var calculatedValue = invoice.calculate();

		assertThat(calculatedValue).isCloseTo(new BigDecimal("250"), within(new BigDecimal("0.1")));

	}
}
