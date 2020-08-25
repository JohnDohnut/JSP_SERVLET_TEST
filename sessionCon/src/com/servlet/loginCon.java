package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@WebServlet(name = "loginCon", urlPatterns = "/loginCon")
public class loginCon extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String ID = request.getParameter("ID");
        String PW = request.getParameter("PW");
        out.println("ID : "+ID+"PW : "+PW);
        HttpSession session = request.getSession();
        session.setAttribute("ID",ID);

        response.sendRedirect("loginOk.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
