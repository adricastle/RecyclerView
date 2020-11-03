package com.example.recyclerview;

public class Equipo {
    private String nombre;
    private String estadio;
    private String entrenador;

    public Equipo(String nombre, String estadio, String entrenador) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }


}
