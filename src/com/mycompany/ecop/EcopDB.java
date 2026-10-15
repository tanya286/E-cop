/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecop;

/**
 *
 * @author User
 */



import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EcopDB {

    private static final String username = "c##ecop";
    private static final String password = "ecop123";

    public Connection con;
    public Statement stmt;
    
    public EcopDB(){
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",username,password);
            stmt=con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

//    public static Connection getConection()
//            throws SQLException{
//        return  DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:XE",
//                    username,
//                    password
//            );
//    }   
}

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class ConnectWithDB {
//    private final String username = "bt";
//    private final String password = "bt";
//    // GRANT CONNECT, RESOURCE TO bt;
//    public Connection con;
//    public Statement stmt;
//    public ConnectWithDB() {
//        try {
//            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", username, password);
//            stmt = con.createStatement();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
