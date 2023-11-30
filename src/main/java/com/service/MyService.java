package com.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyService {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/database";
    private static final String JDBC_USER = "username";
    private static final String JDBC_PASSWORD = "password";

    public List<String> executeStoredProcedure() {
        List<String> resultList = new ArrayList<>();

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Call the stored procedure
            CallableStatement callableStatement = connection.prepareCall("{call my_stored_procedure()}");
            ResultSet resultSet = callableStatement.executeQuery();

            // Process the result set and add values to the list
            while (resultSet.next()) {
                String value = resultSet.getString("column_name"); // Replace with your column name
                resultList.add(value);
            }

            // Close resources
            resultSet.close();
            callableStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }
}
