package com.epam.user.dao;

import com.epam.user.User;

import java.util.List;

/**
 * Created by alex on 15.2.17.
 */
public interface UserDao {
    public User findUserByUserId(Long userId);
    public Long save (User User);
    public void delete(Long id);
    public void update(User User);
    public List<User> findAllUsers();
}
