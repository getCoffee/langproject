package redmal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
    private Connection dbConnection = null;
    private String url = "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3214145";
    private String user = "sql3214145";
    private String password = "EmrDHlTHv3";

    public void openConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            dbConnection = DriverManager.getConnection(url, user, password);

            if (dbConnection != null){
                System.out.println("Connected to database successfully.");
            }
        }catch(ClassNotFoundException | SQLException exc){
            System.out.println("An error occurred while trying to connect to database.");
            System.out.println(exc);
        }
    }
}
