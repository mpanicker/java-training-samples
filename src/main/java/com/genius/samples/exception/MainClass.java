package com.genius.samples.exception;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {

    private static String DATABASE_EXCEPTION = "DATABASE_EXCEPTION";
    private static final Logger logger = Logger.getLogger(MainClass.class);

    public static void main(String[] args) {
        try {
            makeDatabaseConnection();
        } catch (HandledException e) {
            // Display custom message to the user
            System.out.println("Code: "+e.getCode()+" Exception Message : "+e.getMessage());
            // Log the exception detail
            logger.error("Exception: ", e);
        }
    }

    static void makeDatabaseConnection() throws HandledException {
        String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        String userName = "sa";
        String password = "secret";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (SQLException e) {
            throw new HandledException(DATABASE_EXCEPTION,"Failed to connect to database", e);
        }
    }
}
