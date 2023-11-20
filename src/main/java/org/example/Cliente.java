package org.example;

import lombok.Data;

@Data
public class Cliente {
    private int numero;
    private String nombre;

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
