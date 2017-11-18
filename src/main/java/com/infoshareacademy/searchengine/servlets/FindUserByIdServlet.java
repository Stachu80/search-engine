package com.infoshareacademy.searchengine.servlets;

import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/ind-user-id")
public class FindUserByIdServlet extends HttpServlet {

    @EJB
    UsersRepositoryDao dao;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // provide your code here

        if (req.getParameter("id") == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }


        // UsersRepositoryDaoBean dao= new UsersRepositoryDaoBean();
        List<User> list = dao.getUsersList();

        PrintWriter writer = resp.getWriter();
        String id = req.getParameter("id");

        User user = dao.getUserById(Integer.valueOf(id));


        if (user != null) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<body>");
            writer.println("Hello" + "    " + user.getName() + " " + user.getSurname() + "!<br/>");
            writer.println("</body>");
            writer.println("</html>");


        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}