/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kariyawasam
 */
public class dbConnection {

    private static final String USERNAME = "dbUser";
    private static final String PASSWORD = "1234";
    private static final String CONN_STRING =
            "jdbc:mysql://localhost/conference_management";
    private Connection conn = null;
    private Statement stmt;
    private ResultSet rs;

    public dbConnection() {
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public void DataManipulation(String query) throws SQLException {
        PreparedStatement prsmt = conn.prepareStatement(query);
        prsmt.executeUpdate();
    }

    public ResultSet select(String query) throws SQLException {
        return rs = stmt.executeQuery(query);
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(dbConnection.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
