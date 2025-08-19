package Dao;

import model.Deseos;
import java.util.*;
import java.sql.*;
import db.ConexionBD;

public class DeseosDao {

    public List<Deseos> listar() throws SQLException {
        List<Deseos> l = new ArrayList<>();
        String sql = "SELECT * FROM deseo"; 
           
        try (Connection c = ConexionBD.conectar();
             Statement s = c.createStatement();
             ResultSet r = s.executeQuery(sql)) {

            while (r.next()) {
                int id = r.getInt("id"); 
                String nombre = r.getString("nombre");
                double precio = r.getDouble("precio");
                int cantidad = r.getInt("cantidad");
               l.add(new Deseos(id, nombre, precio, cantidad));
            }
        }
        return l;
    }

 public int insertar(Deseos e) throws SQLException {
    String sql = "INSERT INTO deseo (nombre, precio, cantidad) VALUES (?, ?, ?)";
    try (Connection c = ConexionBD.conectar();
         PreparedStatement p = c.prepareStatement(sql)) {

        p.setString(1, e.getNombre());
        p.setDouble(2, e.getPrecio());
        p.setInt(3, e.getCantidad());
        return p.executeUpdate();
    }
}


    public int actualizar(int id, Deseos e) throws SQLException {
        String sql = "UPDATE deseo SET nombre = ?, precio = ?, cantidad = ? WHERE id = ?";
        try (Connection c = ConexionBD.conectar();
             PreparedStatement p = c.prepareStatement(sql)) {

            p.setString(1, e.getNombre());
            p.setDouble(2, e.getPrecio());
            p.setInt(3, e.getCantidad());
               p.setInt(4, id);
            return p.executeUpdate();
        }
    }

public int eliminar(int id) throws SQLException {
    String sql = "DELETE FROM deseo WHERE id = ?";
    try (Connection c = ConexionBD.conectar();
         PreparedStatement p = c.prepareStatement(sql)) {

        p.setInt(1, id);
        return p.executeUpdate();
    }
}



    // Para que tu formulario pueda llamar dao.insert(d);
    public int insert(Deseos d) throws SQLException {
        return insertar(d);
    }
}
