package tudelft.points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerPointsTest {

	private final PlayerPoints pp = new PlayerPoints();

	@Test
	void lessPoints() {
		assertEquals(30+50, pp.totalPoints(30, 5));
	}

	@Test
	void manyPointsButLittleLives() {
		assertEquals(300+30, pp.totalPoints(300, 1));
	}

	@Test
	void manyPointsAndManyLives() {
		assertEquals(500*3, pp.totalPoints(500, 10));
	}

	@Test
	void betweenLessAndManyPoints() {
		assertEquals(49+50, pp.totalPoints(49, 5));
		assertEquals(50*3, pp.totalPoints(50, 5));
	}

	@Test
	void betweenLessAndManyLives() {
		assertEquals(500*3, pp.totalPoints(500, 3));
		assertEquals(500+30, pp.totalPoints(500, 2));
	}
}
