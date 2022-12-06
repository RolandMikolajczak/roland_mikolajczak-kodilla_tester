package com.kodilla.stream.homework;

import com.kodilla.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuite {
    @Test
    public void shouldReturnAverageCountOfPostsForOver40 (){
        ForumStats average = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Roland",45,200,"Pilkarz"));
        users.add(new User("Marek",42,100,"Lekarz"));
        double result = average.returnAverageCountOfPostsOver40(users);
        assertEquals(150,result,0.01);
    }
    @Test
    public void shouldNotIncludeAverageCountOfPostsForOver40 (){
        ForumStats average = new ForumStats();
        List<User> users = new ArrayList<>();
        users.add(new User("Roland",45,200,"Pilkarz"));
        users.add(new User("Marek",13,100,"Lekarz"));
        double result = average.returnAverageCountOfPostsBelow40(users);
        assertEquals(100,result,0.01);
    }
    @Test
    public void shouldReturn0WhenListIsEmpty (){
        ForumStats average = new ForumStats();
        List<User> users = new ArrayList<>();
        double result = average.returnAverageCountOfPostsBelow40(users);
        assertEquals(0.0,result,0.01);
    }
    
}
