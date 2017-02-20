package com.epam.user.dao;

import com.epam.user.User;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by alex on 15.2.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-spring-dao.xml"})
public class UserDaoImplTest {

    @Autowired
    private UserDaoImpl userDao;


    @Ignore
    @Test
    public void findUserById() throws Exception {
        User user=userDao.findUserByUserId(1L);
        Assert.assertNotNull(user);
        Assert.assertEquals("userLogin1",user.getLogin());
        Assert.assertEquals("userPassword1",user.getPassword());
        Assert.assertEquals("first user",user.getDescription());
    }

    @Test
    public void save() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void findAllUsers() throws Exception {

    }
}