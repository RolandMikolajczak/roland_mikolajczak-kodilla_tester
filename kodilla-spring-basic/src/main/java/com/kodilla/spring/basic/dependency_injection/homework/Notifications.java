package com.kodilla.spring.basic.dependency_injection.homework;

public interface Notifications {
    public void success(String address);
    public void fail(String address);
}
