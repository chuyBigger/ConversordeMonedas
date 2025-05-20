package com.aluracursos.conversordm.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroModificacion {
    private String usuario;
    private String accion;
    private String detalle;
    private String fechaHora;

    public RegistroModificacion(String usuario, String accion, String detalle, String fechaHora) {
        this.usuario = usuario;
        this.accion = accion;
        this.detalle = detalle;
        this.fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY_HH:mm:ss"));
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "RegistroModificacion{" +
                "usuario='" + usuario + '\'' +
                ", accion='" + accion + '\'' +
                ", detalle='" + detalle + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }

}
