package com.infoshareacademy.searchengine.dao;

import javax.ejb.Local;

import com.infoshareacademy.searchengine.domain.User;

import java.util.List;

@Local
public interface UsersRepositoryDao {

    public User addUser(User user);

    public User getUserById(int id);

    public User getUserByLogin(String login);

    public List<User> getUsersList();
}
