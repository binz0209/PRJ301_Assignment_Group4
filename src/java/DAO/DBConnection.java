package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, userID, password);
        System.out.println("Connection successful!");
        return conn;
    }
    private final String serverName = "HoaiLinhWFIL";
    private final String dbName = "YonShop";
    private final String portNumber = "1433";
    private final String instance = "";
    private final String userID = "sa";
    private final String password = "1312";
}