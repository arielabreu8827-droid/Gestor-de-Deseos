/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;

public class ConexionBD {
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/escuela?serverTimezone=UTC",
                 "root", "12345" 
         );
    }
    
}
