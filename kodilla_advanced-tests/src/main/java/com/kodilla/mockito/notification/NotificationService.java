package com.kodilla.mockito.notification;

public class NotificationService {

    private Client client;
    public void addSubscriber(Client client) {
        this.client = client;

    }

    public void sendNotification(Notification notification) {
        this.client.receive(notification);

    }
}

