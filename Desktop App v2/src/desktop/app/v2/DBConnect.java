/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop.app.v2;

import java.sql.*;

/**
 *
 * @author zy395907
 */
public class DBConnect {

    public Connection openConnection() {
        try {
            final String DB_HOST = "jdbc:mysql://localhost:3306/tm470";
            final String DB_USER = "root";
            final String DB_PASSWD = "";

            Connection conn = DriverManager.getConnection(
                    DB_HOST, DB_USER, DB_PASSWD);
            return conn;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("There was nothing to close");
        }
    }
}
