package com.kodilla.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals(int expected, double actual) {
        return expected == actual;
    }
    public static boolean assertEquals(int expected, double actual,double delta){
        return Math.abs(expected-actual)<=delta;
    }
}
