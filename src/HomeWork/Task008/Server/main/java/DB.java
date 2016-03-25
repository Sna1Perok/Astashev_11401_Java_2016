package ru.kpfu.itis.Group11401.Astashev.Task008.Server.main.java; /**
 * Created by 1 on 15.10.2015.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Words", "postgres", "1");
        return conn;
    }


}