package com.infoshareacademy.searchengine.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // provide your code here
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        if (name != null) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<body>");
            writer.println("Hello"+"    "+ name+ "!<br/>");
            writer.println("</body>");
            writer.println("</html>");


        } else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}