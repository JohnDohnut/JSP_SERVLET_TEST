package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(name = "ServletEx", urlPatterns="/SE")
public class ServletEx extends javax.servlet.http.HttpServlet {
    @Override
    public void init(javax.servlet.ServletConfig config) throws ServletException {
        System.out.println("init()\n");
        super.init(config);

    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doPost()\n");
        String defaultId = getServletConfig().getInitParameter("defaultId");
        PrintWriter out = response.getWriter();
        out.print(defaultId);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doGet()\n");
        doPost(request, response);
    }
}
