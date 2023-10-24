package com.example.recyclerview_p.Models;

public class Equipos {
    private String nombre;
    private String liga;
    private String estadio;

    private String descripcion = null;

    public Equipos(String nombre, String liga, String estadio, String descripcion) {
        this.nombre = nombre;
        this.liga = liga;
        this.estadio = estadio;
        this.descripcion =descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getLiga() {
        return liga;
    }
    public String getEstadio() {
        return estadio;
    }
    public String getDescripcion(){return  descripcion;}
}
