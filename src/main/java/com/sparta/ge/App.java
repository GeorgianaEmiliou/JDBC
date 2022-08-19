package com.sparta.ge;

import java.sql.*;

public class App {
    //Connection - Interface
    //Statement - SQL statement
    //Resultset - set of results
    public static void main( String[] args ) {
        Connection postgresConn = ConnectionManager.connectionToDB();
        UserDAO userDAO = new UserDAO(postgresConn);
        //userDAO.createUser(3, "Danny", "djew@spartaglobal.com");
        //userDAO.createUser(4, "Laura", "lsmith@spartaglobal.com");
        //userDAO.deleteUser(3);
        userDAO.printAllUsers();
        ConnectionManager.closeConnection();
    }


}
