package com.khoubyari.example.dao.jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDaoInseguro {
    public void getUser(String userName) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:myDriver:myDatabase", "user", "password");
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM users WHERE name = '" + userName + "'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // procesar los resultados
            }
        } catch (Exception e) {
            // manejar la excepción
        }
    }
}