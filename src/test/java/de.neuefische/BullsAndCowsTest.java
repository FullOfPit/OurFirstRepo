package de.neuefische;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BullsAndCowsTest {

    @ParameterizedTest
    @CsvSource({
            "1234,1234,You found the secret code. Congratulations!",
            "1234,5618,0 bull(s) and 1 cow(s).",
            "1234,5371,0 bull(s) and 2 cow(s).",
            "1234,4371,0 bull(s) and 3 cow(s).",
            "1234,4321,0 bull(s) and 4 cow(s).",
            "1234,5278,1 bull(s) and 0 cow(s).",
            "1234,5218,1 bull(s) and 1 cow(s).",
            "1234,2138,1 bull(s) and 2 cow(s).",
            "1234,2314,1 bull(s) and 3 cow(s).",
            "1234,1638,2 bull(s) and 0 cow(s).",
            "1234,1438,2 bull(s) and 1 cow(s).",
            "1234,3214,2 bull(s) and 2 cow(s).",
            "1234,1274,3 bull(s) and 0 cow(s).",
    })
    void compare(String secretCode, String guess, String expectedMsg) {
        String actualMsg = BullsAndCows.compare(secretCode, guess);

        assertEquals(expectedMsg, actualMsg);
    }
}