package edu.misena.facturaJava.model;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    private static int  ultimoCodigo = 0;

    private static String generarCodigo (){
       ultimoCodigo++;
       return String.format("p%05d", ultimoCodigo);
    }

    public Producto (){
        this.codigo = generarCodigo();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
