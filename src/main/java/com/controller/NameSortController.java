package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.NameSortService;

@WebServlet("/SortNamesController")
public class NameSortController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private NameSortService nameSortService;

    @Override
    public void init() throws ServletException {
        nameSortService = new NameSortService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Generate or obtain a list of 10,000 names here
        List<String> names = generateNamesList();

        // Number of threads to use for sorting
        int numThreads = 4; // Adjust this based on your server's capacity

        // Sort the names using the service class
        List<String> sortedNames = nameSortService.sortNamesMultithreaded(names, numThreads);

        // Store the sorted names in a request attribute
        request.setAttribute("sortedNames", sortedNames);

        // Forward the request to a JSP page for displaying the result
        RequestDispatcher dispatcher = request.getRequestDispatcher("/show.jsp");
        dispatcher.forward(request, response);
    }

    private List<String> generateNamesList() {
        // TODO Auto-generated method stub
        return null;
    }

    // Other methods (generateNamesList) remain the same
}

