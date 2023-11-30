package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import javax.servlet.http.*;
import org.json.*;


@WebServlet("/JSONReaderServlet")
public class JSONReaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the uploaded JSON file
        Part filePart = request.getPart("jsonFile");
        InputStream fileContent = filePart.getInputStream();

        // Read JSON using Stream API
        try (InputStreamReader reader = new InputStreamReader(fileContent);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonContent.append(line);
            }


            JSONObject jsonObject = new JSONObject(jsonContent.toString());


            System.out.println(jsonObject.toString());


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
