package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    public Set<Integer> convertStringToIntegerSet(String input) {
        String[] array = input.split(",");
        Set<Integer> results = new HashSet<>();
        for (String element : array) {
            int number = Integer.parseInt(element);
            results.add(number);
        }
        return results;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv")
    public void ShouldThrowExceptionIfNumberIsOutOfRange(String input) {
        Set<Integer> number = convertStringToIntegerSet(input);
        GamblingMachine gamblingMachine = new GamblingMachine();
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CorrectNumbers.csv")
    public void ShouldReturnWinsIfInputIsCorrect(String input) throws InvalidNumbersException {
        Set<Integer> number = convertStringToIntegerSet(input);
        GamblingMachine gamblingMachine = new GamblingMachine();
        int inputs = gamblingMachine.howManyWins(number);
        assertTrue(inputs >= 0 && inputs <= 6);

    }
}