package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"roland", "Roland1", "Roland._1"})
    public void shouldReturnCorrectnessOfUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        Assertions.assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"roland>", "Roland?", "Roland/"})
    public void shouldReturnIncorrectnessOfUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        Assertions.assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"roland@roland.pl", "Roland1@hash.com", "Roland._1@bogusz.poland"})
    public void shouldReturnCorrectnessOfEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        Assertions.assertTrue(result);
    }
}
