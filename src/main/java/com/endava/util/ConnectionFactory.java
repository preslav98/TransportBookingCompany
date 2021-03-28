package com.endava.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private Connection connection = null;

    public Connection createConnection() {
        try (FileInputStream file = new FileInputStream("src/main/resources/application.properties")) {
            Properties pros = new Properties();
            pros.load(file);
            String url = pros.getProperty("URL");
            String user = pros.getProperty("Uname");
            String password = pros.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException exception) {
            System.err.println(exception.getMessage());
        }

        return connection;

    }
}
