package com.aluracursos.conversordm.sistema;

import com.aluracursos.conversordm.modelos.Divisas;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDivisas {

    ArrayList<Divisas> listaDivisasDisponibles = new ArrayList<>();

    public MenuDivisas() {

        listaDivisasDisponibles.add(new Divisas("MXN", "Peso Mexicano"));
        listaDivisasDisponibles.add(new Divisas("ARS", "Peso Argentino"));
        listaDivisasDisponibles.add(new Divisas("BRL", "Real Brasileño"));
        listaDivisasDisponibles.add(new Divisas("USD", "Dólar Estadounidense"));
        listaDivisasDisponibles.add(new Divisas("EUR", "Euro"));
        listaDivisasDisponibles.add(new Divisas("JPY", "Yen Japones"));

    }

    public void mostrarMenu() {

        System.out.println("Selecione una divisa: ");

        for (int i = 0; i < listaDivisasDisponibles.size(); i++) {

            Divisas div = listaDivisasDisponibles.get(i);
            System.out.println((i + 1) + ".- " + div.getCodigo() + "  " + div.getNombre() + ".");

        }
    }

    public Divisas pedirSeleccion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("Ingresa el numero de la 'DIVISA' que deseas seleccionar del 1 al " + listaDivisasDisponibles.size());
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion < 1 || opcion > listaDivisasDisponibles.size()) {
                    System.out.println("Ingresa un Valor dentro del rango correcto: 1 al" + listaDivisasDisponibles.size());
                }
            } else {
                System.out.println("El Valor que ingresaste no es valido. Intenta de nuevo!");
                scanner.next();
            }

        } while (opcion < 1 || opcion > listaDivisasDisponibles.size());

        return listaDivisasDisponibles.get(opcion - 1);


    }
    public void agregarDivisa(Divisas nuevaDivisa){
        listaDivisasDisponibles.add(nuevaDivisa);
        System.out.println("Divisa agregada al menu de Divisas");
    }

}