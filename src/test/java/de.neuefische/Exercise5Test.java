package de.neuefische;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @ParameterizedTest
    @CsvSource({
            "1,true",
            "some-string,false",
            "1.1,false",
            "true,false",
            "false,false",
    })
    void isInteger(String input, boolean expected) {
        boolean actual = Exercise5.isInteger(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,false",
            "some-string,false",
            "1.1,true",
            "0.1,true",
            "true,false",
            "false,false",
    })
    void isDouble(String input, boolean expected) {
        boolean actual = Exercise5.isDouble(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,false",
            "some-string,false",
            "1.1,false",
            "true,true",
            "TRUE,true",
            "True,true",
            "false,true",
            "FALSE,true",
            "False,true",
    })
    void isBoolean(String input, boolean expected) {
        boolean actual = Exercise5.isBoolean(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,Integer",
            "some-string,String",
            "1.1,Double",
            "true,Boolean",
            "TRUE,Boolean",
            "True,Boolean",
            "false,Boolean",
            "FALSE,Boolean",
            "False,Boolean",
    })
    void detectDataType(String input, String expected) {
        String actual = Exercise5.detectDataType(input);

        assertEquals(expected, actual);
    }
}