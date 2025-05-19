package com.aluracursos.conversordm.modelos;

public class RegistroConversion {

    private String origen;
    private String destino;
    private double monto;
    private double resultado;
    private String fecha;

    public RegistroConversion (String origen, String destino, double monto, double resultado, String fecha) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
        this.resultado = resultado;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return monto + " " + origen + " = " + resultado + " " + destino + "a la fecha: " + fecha;
    }
}
