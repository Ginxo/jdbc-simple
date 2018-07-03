package com.everis.alicante.eoi.jdbc;

import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection connection;

    public ConnectionManager() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise1", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException("can´t connect", e);
        }
    }

    @PreDestroy
    private void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("can´t close", e);
        }
    }
}
