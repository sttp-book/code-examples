package tudelft.minmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// this one is definitely not so elegant...
// see MinMaxTest for the best version!
public class MinMaxSimpleTest {

	@Test
	void t1() {
		MinMax mm = new MinMax();

		mm.find(new int[]{5, 2, 15, 27});

		assertEquals(27, mm.getMax());
		assertEquals(2, mm.getMin());
	}

	@Test
	void t2() {
		MinMax mm = new MinMax();

		mm.find(new int[]{27, 26, 25});

		assertEquals(27, mm.getMax());
		assertEquals(25, mm.getMin());
	}

}
