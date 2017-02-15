package com.epam.user.user.daoapi;

import com.epam.user.User;

import java.util.List;

/**
 * Created by alex on 15.2.17.
 */
public interface UserDao {
    public User findUserById(Long id);
    public Long save (User User);
    public void delete(Long id);
    public void update(User User);
    public List<User> findAllUsers();
}
