package com.aluracursos.conversordm.modelos;

public class Divisas {
    private String codigo;
    private String nombre;

    public Divisas(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }


}
