package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TemperatureConverterServlet")
public class TemperatureConverterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the Celsius temperature from the request parameters
        String celsiusStr = request.getParameter("celsius");

        if (celsiusStr != null && !celsiusStr.isEmpty()) {
            try {
                // Convert the Celsius temperature to Fahrenheit
                double celsius = Double.parseDouble(celsiusStr);
                double fahrenheit = (celsius * 9/5) + 32;

                // Set the result as an attribute in the request
                request.setAttribute("result", fahrenheit);
            } catch (NumberFormatException e) {
                // Handle invalid input
                request.setAttribute("error", "Invalid input. Please enter a valid number.");
            }
        }

        // Forward the request to the JSP for displaying the result
        request.getRequestDispatcher("/temperatureConverter.jsp").forward(request, response);
    }
}
