package org.example;

import lombok.Data;

import java.util.Date;
@Data

public class Tareas {
        private int numero;
        private EstadoDeLaTarea estado;
        private String descripcion;
        private Cliente cliente;
        private Tecnico tecnico;
        private Date fechaEntrada;
        private Servicio servicio;

    public void cambiarEstado(CambioEstadoDeLaTarea cambioEstadoLambda) {
        this.estado = cambioEstadoLambda.cambiarEstado(this.estado);
    }



    public enum EstadoDeLaTarea {
        NO_INICIADO,
        EN_PROCESO,
        FINALIZADO,
    }


    @FunctionalInterface;

    public interface CambioEstadoDeLaTarea {
        EstadoDeLaTarea cambiarEstado(EstadoDeLaTarea estadoActual);
    }
}