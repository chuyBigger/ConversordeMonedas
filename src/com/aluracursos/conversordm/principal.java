package com.aluracursos.conversordm;

import com.aluracursos.conversordm.modelos.Divisas;
import com.aluracursos.conversordm.modelos.MenuDivisas;

public class principal {
    public static void main(String[] args) {
        System.out.println(" Binvenido al sistema conversor de divisas ");
        MenuDivisas menu = new MenuDivisas();

        menu.mostrarMenu();

        Divisas seleccion = menu.pedirSeleccion();

        System.out.println("Seleccionaste: "+ seleccion.getCodigo()+"  " + seleccion.getNombre());
    }
}
