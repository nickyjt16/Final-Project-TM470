package tm470;

import java.sql.*;
import java.util.*;

public class DataConnect {

    String vdbDriver = "jdbc:sqlite:";
    String vDatabase = "D:/Program Files/SQLiteDatabaseBrowserPortable/Data/TM470.db";
    Connection vConnection = null;

    /**
     * method to test database connection which returns a boolean value
     */
    public boolean testConnection() {

        //try connecting to database, if successful show success message and return true boolean value
        try {
            vConnection = (Connection) DriverManager.getConnection(vdbDriver + vDatabase);
            System.out.println("Connection to database successful!");
            return true;

            //catch will show unsuccessful message and return false boolean value  	
        } catch (Exception ex) {
            System.err.println("Connection unsuccessful\n" + ex.toString());
            return false;
        }

    }

    /**
     * return the list of managers to populate the manager list in cmboManager
     * on AddAnOfficer.java
     *
     * @return List of managers
     * @throws java.sql.SQLException
     */
    public List<String> getManagers() throws SQLException {
        List<String> list = new ArrayList();
        vConnection = DriverManager.getConnection(vdbDriver + vDatabase);
        try {
            Statement stmt = vConnection.createStatement();
            String query = "SELECT name FROM managers ORDER BY name";
            ResultSet results = stmt.executeQuery(query);
            list.add(null);
            while (results.next()) {
                list.add(results.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println("Exception = " + e);
        }
        return list;
    }

    public List<String> getOfficers() throws SQLException {
        List<String> list = new ArrayList();
        vConnection = DriverManager.getConnection(vdbDriver + vDatabase);
        try {
            Statement stmt = vConnection.createStatement();
            String query = "SELECT name FROM officers ORDER BY name";
            ResultSet results = stmt.executeQuery(query);
            list.add(null);
            while (results.next()) {
                list.add(results.getString("name"));
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Exception = " + e);
        }
        return list;
    }

    public ResultSet getManagersDetails(String name) throws SQLException {
        List<String> list = new ArrayList();
        vConnection = DriverManager.getConnection(vdbDriver + vDatabase);
        try {
            Statement stmt = vConnection.createStatement();
            String query = "SELECT * FROM managers WHERE name = \"" + name + "\" ORDER BY name";
            ResultSet results = stmt.executeQuery(query);

            return results;

        } catch (SQLException e) {
            System.out.println("Exception = " + e);
        }
        //System.out.println(list);
        return null;
    }

    public void deleteManager(String managerId) throws SQLException {
        vConnection = DriverManager.getConnection(vdbDriver + vDatabase);
        PreparedStatement st = vConnection.prepareStatement("DELETE FROM Managers WHERE id = \" + managerId + \"");
        st.executeUpdate();

    }

}
