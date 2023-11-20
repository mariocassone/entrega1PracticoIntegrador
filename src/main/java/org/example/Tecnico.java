package org.example;

import lombok.Data;

import java.util.List;

@Data
public class Tecnico {
    private int NumeroTecnico;
    private String nombre;
    private List<Especialidad> especialidad;

    public int getNumeroTecnico() {
        return NumeroTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setNumeroTecnico(int numeroTecnico) {
        NumeroTecnico = numeroTecnico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }
}
