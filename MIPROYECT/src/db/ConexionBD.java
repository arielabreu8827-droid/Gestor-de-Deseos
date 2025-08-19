// Ejemplo de ConexionBD para Laragon (ajústalo a tu proyecto)
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/myproyecto?serverTimezone=UTC",
                 "root", "12345" 
         );
    }
    
}


