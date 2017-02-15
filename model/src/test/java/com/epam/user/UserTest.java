package com.epam.user;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 13.2.17.
 */

public class UserTest {
    private User user;
    private String login;
    private String password;
    private Integer userId;
    private String description;

    @Before
    public void setUp() {
        user = new User();
        userId = 2;
        login = "UserLogin";
        password = "UserPassword";
        description = "descrip";


    }

    @Test
    public void getUserId() throws Exception {
        user.setUserId(10);
        assertEquals(10L, user.getUserId(), 0);

    }

    @Test
    public void getLogin() throws Exception {
        user.setLogin(login);
        assertEquals(login, user.getLogin());

    }

    @Test
    public void getPassword() throws Exception {
        user.setPassword(password);
        assertEquals(password, user.getPassword());
    }


    @Test
    public void getDescription() throws Exception {
        user.setDescription(description);
        assertEquals(description, user.getDescription());
    }
}