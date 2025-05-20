package com.aluracursos.conversordm.sistema.funciones;

import com.aluracursos.conversordm.api.MostrarTodasDivisas;
import com.aluracursos.conversordm.modelos.Divisas;
import com.aluracursos.conversordm.sistema.MenuDivisas;

import java.util.Scanner;

public class AgregarDivisas {
    Scanner scanner = new Scanner(System.in);
    MenuDivisas menu = new MenuDivisas();
    MostrarTodasDivisas mDivisas = new MostrarTodasDivisas();

    public void ejecutar(){
        System.out.println("Agregar una divisa al menu desde la 'Api'");

        mDivisas.mostrarDivisas(); // todo Aqui va el menu para mostrar todas las Divisas desde la api

        System.out.println("Ingresa el codigo de la divisa que deseas agregar (Ejemplo: USD )");
        String codigo = scanner.nextLine();

        System.out.println("Ingresa el 'Nombre' que deseas agregar al codigo de la divisa (Ejemplo: Dolar americano)");
        String nombre = scanner.nextLine();

        menu.agregarDivisa(new Divisas(codigo,nombre)); // agrega la nueva divisa al menu que se puestra en conversion de Divisas



    }
}
