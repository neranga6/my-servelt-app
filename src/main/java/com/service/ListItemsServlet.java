package com.service;

// ListItemsServlet.java
// Import statements...

import com.model.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ListItemsServlet")
public class ListItemsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve items from your data source (e.g., a list or a database)
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Item 1"));
        itemList.add(new Item(2, "Item 2"));
        // Add the itemList to request attribute
        request.setAttribute("itemList", itemList);

        // Forward the request to list.jsp
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
