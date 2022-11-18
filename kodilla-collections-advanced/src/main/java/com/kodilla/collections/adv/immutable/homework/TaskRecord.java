package com.kodilla.collections.adv.immutable.homework;

public record TaskRecord(String title,int duration,double average) {
    TaskRecord taskRecord = new TaskRecord(“test”, 566, 2022);
}
