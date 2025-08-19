/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import db.ConexionBD;
import java.sql.Connection;
  
/**
 *
 * @author ariel
 */
public class probar_conexion {

    public static void main(String[] args) {
        try {
            Connection conn = ConexionBD.conectar();
            System.out.println("✅ Conexión exitosa a la base de datos!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
    }
}
