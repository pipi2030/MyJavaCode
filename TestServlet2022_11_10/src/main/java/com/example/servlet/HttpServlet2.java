package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HttpServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HttpServlet doGet方法");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HttpServlet doPost方法");
    }
}
