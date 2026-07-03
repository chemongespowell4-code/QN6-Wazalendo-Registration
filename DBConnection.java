package com.mycompany.qn6.wazalendo;

import java.sql.*;

public class DBConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:ucanaccess://C:/Databases/Wazalendo.accdb";
            return DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
