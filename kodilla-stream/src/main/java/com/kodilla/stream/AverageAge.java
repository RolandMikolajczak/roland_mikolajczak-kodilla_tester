package com.kodilla.stream;

import com.kodilla.UsersRepository;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(u->u.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
