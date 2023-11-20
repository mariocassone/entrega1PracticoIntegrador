package org.example;
    import lombok.Data;
    @Data

    public class Servicio {
        private int codigo;
        private String nombre;

        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

