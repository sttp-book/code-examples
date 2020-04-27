package tudelft.intro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxTest {

	private final MinMax mm = new MinMax();

	@ParameterizedTest
	@MethodSource("generator")
	void validListOfNumbers(int[] nums, int expectedMin, int expectedMax) {
		mm.find(nums);

		assertEquals(expectedMax, mm.getMax());
		assertEquals(expectedMin, mm.getMin());
	}

	private static Stream<Arguments> generator() {
		// list in an descending order
		Arguments tc1 = Arguments.of(new int[]{27, 26, 25}, 25, 27);

		// numbers in random order
		Arguments tc2 = Arguments.of(new int[]{5, 2, 15, 27}, 2, 27);

		// ... what else?

		return Stream.of(tc1, tc2);
	}
}
