package model;

public class Deseos {

    private int id;           // si tu tabla tiene PK autoincrement
    private String nombre;
    private double precio;
    private int cantidad;

    public Deseos() {
        // sin excepción
    }

    // Usado al INSERT (sin id, la BD lo genera)
    public Deseos(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Usado al SELECT (con id desde la BD)
    public Deseos(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
