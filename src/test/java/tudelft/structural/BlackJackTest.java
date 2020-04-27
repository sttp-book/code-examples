package tudelft.structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.structural.BlackJack;

public class BlackJackTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }
}
