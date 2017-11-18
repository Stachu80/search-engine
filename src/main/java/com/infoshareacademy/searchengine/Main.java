package com.infoshareacademy.searchengine;

import com.infoshareacademy.searchengine.dao.UsersRepository;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;

import java.util.List;

public class Main {
    public static void main(String[] arogs) {



        UsersRepositoryDaoBean dao = new UsersRepositoryDaoBean();
        List<User> list = dao.getUsersList();

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getSurname());
            System.out.println(list.get(i).getAge());
            System.out.println(list.get(i).getLogin());
            System.out.println("______________________");

        }



        /*System.out.println("Heloo World");
        List<User> list =  UsersRepository.getRepository();
        System.out.println(list.size());

        for (int i = 0; i < list.size() ; i++) {

            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getSurname());
            System.out.println(list.get(i).getAge());
            System.out.println(list.get(i).getLogin());
            System.out.println("______________________");

        }*/




    }
}
