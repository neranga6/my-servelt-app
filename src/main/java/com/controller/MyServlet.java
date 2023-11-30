package com.controller;

import com.service.MyService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyService myService = new MyService();
        List<String> resultList = myService.executeStoredProcedure();

        request.setAttribute("resultList", resultList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
    }
}
