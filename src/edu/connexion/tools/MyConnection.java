package edu.connexion.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private String url="jdbc:mysql://localhost:3306/WomenEmpowerment";
    private String login="root";
    private String pwd="";
    Connection cnx;
    public MyConnection(){
        try{
            cnx= DriverManager.getConnection(url,login,pwd);
            System.out.println("avec succe");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public Connection getCnx() {
        return cnx;
    }
}
