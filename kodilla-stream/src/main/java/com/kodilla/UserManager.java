package com.kodilla;

import java.util.List;
import java.util.stream.Collectors;

public class UserManager {


    public static void main(String[] args) {
        List<String> chemistGroupUsernamesAge = filterChemistGroupUsernamesAge(45);
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }
    public static List<String> filterChemistGroupUsernames() {
            List<String> usernames = UsersRepository.getUsersList()   // [1]
                    .stream()
                    .filter(user -> user.getGroup().equals("Chemists"))
                    .map(UserManager::getUserName)
                    .collect(Collectors.toList());
            return usernames;
    }
    public static List<String> filterChemistGroupUsernamesAge(int age) {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .filter(user -> user.getAge() > age)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static int getUserAge(User user){
        return user.getAge();
    }
}
