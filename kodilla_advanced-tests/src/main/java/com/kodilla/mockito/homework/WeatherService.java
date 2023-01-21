package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class WeatherService {

    public Map<Client, List<Location>> clientLocationMap = new HashMap<>();

    public void addClient(Client client, Location location){
        List<Location> locationList = clientLocationMap.getOrDefault(client,new ArrayList<>());
        locationList.add(location);
        clientLocationMap.put(client,locationList);

    }

    public void removeClientFromLocation (Client client, Location location){
        List<Location> locationList = clientLocationMap.getOrDefault(client,new ArrayList<>());
        locationList.remove(location);
        clientLocationMap.put(client,locationList);
    }

    public void removeClient(Client client){
        clientLocationMap.remove(client);
    }

    public void removeLocation (Location location){
        for (Map.Entry<Client,List<Location>> map : clientLocationMap.entrySet()){
            removeClientFromLocation(map.getKey(),location);
        }

    }

    public void sendNotificationToStrictLocalization (Notification1 notification1, Location location){
        List<Client> clients = clientLocationMap.entrySet()
                .stream()
                .filter(clientListEntry -> clientListEntry.getValue().contains(location))
                .map(clientListEntry -> clientListEntry.getKey())
                        .collect(Collectors.toList());
        clients.forEach(client -> client.receiveNotification(notification1));
    }

    public void sendNotificationToEveryone (Notification1 notification1){
        List<Client> clients = clientLocationMap.entrySet()
                .stream()
                .map(clientListEntry -> clientListEntry.getKey()).collect(Collectors.toList());
        clients.forEach(client -> client.receiveNotification(notification1));
    }
}
