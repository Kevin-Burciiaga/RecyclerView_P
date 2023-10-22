package com.example.recyclerview_p.Models;

public class Equipos {
    private String nombre;
    private String liga;
    private String estadio;

    public Equipos(String nombre, String liga, String estadio) {
        this.nombre = nombre;
        this.liga = liga;
        this.estadio = estadio;
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
}
