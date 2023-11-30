package com.service;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submit")
public class FormSubmitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Form Submission Result</title></head><body>");
        out.println("<h1>Form Submission Result</h1>");
        out.println("<p>Name: " + request.getParameter("name") + "</p>");
        out.println("<p>Email: " + request.getParameter("email") + "</p>");
        out.println("</body></html>");
        out.close();
    }
}
