/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnector {
    
    private Connection connect;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/amanagement";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // Constructor to connect to the database
    public dbConnector() {
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (SQLException ex) {
            System.err.println("Can't connect to database: " + ex.getMessage());
            ex.printStackTrace();
            connect = null; // Ensure it's explicitly set to null if connection fails
        }
    }

    // Static method to get a database connection
    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException ex) {
            System.err.println("Database Connection Error: " + ex.getMessage());
            throw ex; // Rethrow for higher-level handling
        }
    }

    // Function to retrieve data safely
    public ResultSet getData(String sql) throws SQLException {
        if (connect == null) {
            throw new SQLException("Database connection is not established.");
        }
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }

    // Function to insert data safely using PreparedStatement
    public int insertData(String sql, String... params) {
        int result = 0;
        if (connect == null) {
            System.out.println("Database connection is not established.");
            return result;
        }

        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            // Set parameters dynamically
            for (int i = 0; i < params.length; i++) {
                pst.setString(i + 1, params[i]);
            }
            result = pst.executeUpdate();
            System.out.println("Inserted Successfully!");
        } catch (SQLException ex) {
            System.err.println("SQL Insert Error: " + ex.getMessage());
        }
        return result;
    }
}




