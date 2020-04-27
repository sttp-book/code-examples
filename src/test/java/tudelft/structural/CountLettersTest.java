package tudelft.structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.structural.CountLetters;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

}