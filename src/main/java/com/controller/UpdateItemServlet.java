package com.controller;

// UpdateItemServlet.java
// Import statements...

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateItemServlet")
public class UpdateItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int itemId = Integer.parseInt(request.getParameter("id"));
        String itemName = request.getParameter("name");
        String selectedOption = request.getParameter("selectedOption");

        // Update the item in your data source with the new data

        // Redirect back to the list page after updating
        response.sendRedirect("ListItemsServlet");
    }
}

