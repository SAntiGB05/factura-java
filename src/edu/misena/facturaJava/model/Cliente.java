package edu.misena.facturaJava.model;

public class Cliente {
    private static String nombre;
    private String nif; // Número de Identificación Fiscal


    public static String getNombre (){
        return nombre;
    }

    public static void setNombre(String nombre) {
        Cliente.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}