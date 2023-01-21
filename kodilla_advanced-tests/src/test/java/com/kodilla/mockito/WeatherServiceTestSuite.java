package com.kodilla.mockito;

import com.kodilla.mockito.homework.Client;
import com.kodilla.mockito.homework.Location;
import com.kodilla.mockito.homework.Notification1;
import com.kodilla.mockito.homework.WeatherService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    com.kodilla.mockito.homework.Client client1 = (com.kodilla.mockito.homework.Client) Mockito.mock(Client.class);
    com.kodilla.mockito.homework.Client client2 = (com.kodilla.mockito.homework.Client) Mockito.mock(Client.class);
    com.kodilla.mockito.homework.Client client3 = (com.kodilla.mockito.homework.Client) Mockito.mock(Client.class);
    Location state1 = Mockito.mock(Location.class);
    Location state2 = Mockito.mock(Location.class);
    Location state3 = Mockito.mock(Location.class);
    Notification1 notification = (Notification1) Mockito.mock(Notification1.class);

    @Test
    public void clientSubscribedToLocationShouldReceiveNotification(){
        weatherService.addClient(client1,state1);
        weatherService.sendNotificationToStrictLocalization(notification,state1);

        Mockito.verify(client1).receiveNotification(notification);

    }
    @Test
    public void clientWhoUnsubscribedFromLocationShouldNotReceiveNotification(){
        weatherService.addClient(client1,state1);
        weatherService.addClient(client1,state2);
        weatherService.removeClientFromLocation(client1,state1);

        weatherService.sendNotificationToStrictLocalization(notification,state1);
        weatherService.sendNotificationToStrictLocalization(notification,state2);
        Mockito.verify(client1, Mockito.times(1)).receiveNotification(notification);
    }
    @Test
    public void clientWhoUnsubscribedAllLocationShouldNotreceiveNotification (){
        weatherService.addClient(client1,state1);
        weatherService.addClient(client1,state2);
        weatherService.addClient(client1,state3);

        weatherService.removeClient(client1);
        weatherService.sendNotificationToEveryone(notification);

        Mockito.verify(client1,Mockito.never()).receiveNotification(notification);
    }
    @Test
    public void notificationShouldBeDeliveredOnlyToLocationSubscribers (){
        weatherService.addClient(client1,state1);
        weatherService.addClient(client2,state1);
        weatherService.addClient(client3,state1);
        weatherService.addClient(client1,state2);
        weatherService.addClient(client2,state2);
        weatherService.addClient(client3,state3);

        weatherService.sendNotificationToStrictLocalization(notification,state1);

        Mockito.verify(client2,Mockito.times(1)).receiveNotification(notification);
    }
    @Test
    public void notificationShouldBeDeliveredToEveryone (){
        weatherService.addClient(client1,state2);
        weatherService.addClient(client2,state2);
        weatherService.addClient(client3,state3);
        weatherService.addClient(client1,state3);
        weatherService.addClient(client2,state1);
        weatherService.addClient(client3,state1);

        weatherService.sendNotificationToEveryone(notification);

        Mockito.verify(client1).receiveNotification(notification);
        Mockito.verify(client2).receiveNotification(notification);
        Mockito.verify(client3).receiveNotification(notification);
        Mockito.verify(client2,Mockito.times(1)).receiveNotification(notification);
    }
    @Test
    public void shouldRemoveLocationFromList(){
        weatherService.addClient(client1,state1);
        weatherService.addClient(client2,state1);
        weatherService.addClient(client3,state1);

        weatherService.removeLocation(state1);
        weatherService.sendNotificationToStrictLocalization(notification,state1);

        Mockito.verify(client1,Mockito.never()).receiveNotification(notification);
        Mockito.verify(client2,Mockito.never()).receiveNotification(notification);
        Mockito.verify(client3,Mockito.never()).receiveNotification(notification);
    }
    }



