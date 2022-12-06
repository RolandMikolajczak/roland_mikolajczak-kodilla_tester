package com.kodilla.stream.homework;

import com.kodilla.User;
import com.kodilla.UserManager;
import com.kodilla.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {

    public static void main(String[] args) {
        System.out.println(returnAverageCountOfPostsOver40(UsersRepository.getUsersList()));
        System.out.println(returnAverageCountOfPostsBelow40(UsersRepository.getUsersList()));
    }
    public static double returnAverageCountOfPostsOver40(List<User> users){
        double average = users
                .stream()
                .filter(user -> user.getAge()>=40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        return average;
    }
    public static double returnAverageCountOfPostsBelow40(List<User> users){
        double average = users
                .stream()
                .filter(user -> user.getAge()<40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();
        return average;
    }
}
