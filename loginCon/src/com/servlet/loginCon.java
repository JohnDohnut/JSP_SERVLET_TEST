package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.*;


@WebServlet(name = "loginCon", urlPatterns = "/loginCon")
public class loginCon extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        String ID = request.getParameter("ID");
        String PW = request.getParameter("PW");

        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;

        for(Cookie c : cookies){
            System.out.println("c.getname : "+c.getName()+"c.getValue : "+c.getValue());
            if(c.getName() == ID){
                cookie = c;
            }

        }
        if(cookie == null){
            System.out.println("cookie is null \n");
            cookie = new Cookie("ID",ID);
        }
        response.addCookie(cookie);
        cookie.setMaxAge(10);

        response.sendRedirect("loginOk.jsp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
