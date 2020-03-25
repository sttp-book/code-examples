package tudelft.pizzapasta;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaPastaTest {

	private final PizzaPasta pp = new PizzaPasta();

	@Test
	void pizza() {
		assertEquals("pizza", pp.pizzaOrPasta(15, 50));
	}

	@Test
	void pasta() {
		assertEquals("pasta", pp.pizzaOrPasta(15, 100));
	}

	@Test
	void boundary_x1() {
		assertEquals("pizza", pp.pizzaOrPasta(5, 24));
		assertEquals("pasta", pp.pizzaOrPasta(4, 13));
	}

	@Test
	void boundary_x2() {
		assertEquals("pasta", pp.pizzaOrPasta(20, -75));
		assertEquals("pizza", pp.pizzaOrPasta(19, 48));
	}

	@Test
	void boundary_y() {
		assertEquals("pizza", pp.pizzaOrPasta(15, 89));
		assertEquals("pasta", pp.pizzaOrPasta(8, 90));
	}

	@ParameterizedTest
	@CsvSource({
			"5, 24, pizza",
			"4, 13, pasta",
			"20, -75, pasta",
			"19, 48, pizza",
			"15, 89, pizza",
			"8, 90, pasta"
	})
	void boundary(int x, int y, String expectedResult) {
		assertEquals(expectedResult, pp.pizzaOrPasta(x, y));
	}

}
