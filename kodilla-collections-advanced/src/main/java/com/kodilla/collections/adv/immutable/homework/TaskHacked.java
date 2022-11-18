package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task {
    public TaskHacked(String title, int duration) {
        super(title, duration);
    }

    public void modifyTitle(String newTitle) {
        title = newTitle;
        duration = newDuration;
        TaskRecord taskRecord = new TaskRecord(“test”, 566, 2022);
    }
}
