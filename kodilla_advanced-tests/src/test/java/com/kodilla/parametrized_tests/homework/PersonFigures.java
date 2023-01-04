package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonFigures {
    static Stream<Arguments> dataForBMICalculator() {
        return Stream.of(
                Arguments.of(1.9,90, "Normal (healthy weight)"),
                Arguments.of(1.75,90,"Overweight"),
                Arguments.of(1.83,86,"Overweight")
        );
    }
}
