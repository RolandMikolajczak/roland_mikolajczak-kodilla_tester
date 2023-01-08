package com.kodilla.mockito;

import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;
import com.kodilla.mockito.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {
    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        notificationService.sendNotification(notification);
        Mockito.verify(client,Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client,Mockito.times(1)).receive(notification);

    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {

    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {

    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

    }
}
