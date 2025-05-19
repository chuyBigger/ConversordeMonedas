package com.aluracursos.conversordm.sistema;

import com.aluracursos.conversordm.modelos.*;

import java.util.Scanner;

public class EjecucionPrograma {
    private void ejecutarConversor() {
        Scanner scanner =new Scanner(System.in);
        MenuDivisas menu = new MenuDivisas();
        ConversorDivisas conversor = new ConversorDivisas();
        HistorialConversiones historial = new HistorialConversiones();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecciona la Divisa de Origen:");
            menu.mostrarMenu();
            Divisas origen = menu.pedirSeleccion();

            System.out.println("\nSelecciona la Divisa de destino:");
            Divisas destino = menu.pedirSeleccion();

            System.out.println("Ingresa el monto que deseas convertir ('puedes usar decimales'):");
            double monto = scanner.nextDouble();

            RegistroConversion registro = conversor.convertir(origen.getCodigo(), destino.getCodigo(), monto);
            System.out.println("\n" + registro);
            historial.agregar(registro);

            System.out.println("\n¿Deseas hacer otra conversión? Ingresa cualquier valor para continuar o 'N' para salir:");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Usted ha salido del programa");
                System.out.println("Hasta pronto...");
                historial.mostrarHistorial();
                historial.guardarHistorialComoJson();
                continuar = false;
            }
        }
    }

}
