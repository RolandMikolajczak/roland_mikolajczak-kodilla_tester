package com.kodilla;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestSuite {
    @Test
    public void testUserManager(){
        List<String> result = UserManager.filterChemistGroupUsernames();
        assertEquals(UserManager.filterChemistGroupUsernames().stream().toList(),result);
    }


    @Test
    public void testUzytkownik() {
        List<String> result = UserManager.filterChemistGroupUsernamesAge(45);
        assertEquals(1, result.size());
    }

}
