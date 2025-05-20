package com.aluracursos.conversordm.sistema;

import com.aluracursos.conversordm.sistema.funciones.AgregarDivisas;
import com.aluracursos.conversordm.sistema.funciones.BorrarDivisas;

import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAdministrador {
    Scanner scanner = new Scanner(System.in);
    AgregarDivisas nuevaDivisa = new AgregarDivisas();
    BorrarDivisas borrarDivisa = new BorrarDivisas();
    AgregarDivisas agregarDivisas = new AgregarDivisas();


    public void mostrarMenuAdministrador() {
        int opcion;

        do {
            System.out.println("""
                \n              ========= MENÚ ADMINISTRADOR =========
                
                                       1. Agregar nueva divisa
                                       2. Eliminar divisa existente
                                       3. Ver divisas registradas
                                       4. Salir del menú administrador
                                       
                                =======================================
                                
                Selecciona una opción:
            """);
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion){
                    case 1:
                        System.out.println("Agregar una nueva divisa el menu principal");
                        agregarDivisas.ejecutar();// todo nuevaDivisa.agregar(); en desarollo
                        System.out.println("Presiona ENTER para continuar...");
                        scanner.nextLine();
                        break;
                    case 2:
                        System.out.println("borrar una divisa !!");
                        // todo borrarDivisa.delete(); en desarrollo
                        System.out.println("Presiona ENTER para continuar...");
                        scanner.nextLine();
                        break;
                    case 3:
                        System.out.println("mostrar registro de divisasas");
                        // todo menu de divisas disponibles en desarrollo
                        System.out.println("Presiona ENTER para continuar...");
                        scanner.nextLine();
                        break;
                    case 4:
                        System.out.println("Gracias por usar este programa");
                        // todo salida del sistema en desarrollo
                        System.out.println("Presiona ENTER para continuar...");
                        scanner.nextLine();
                        break;
                    default:
                        System.out.println("Opcion invalida o el valor introducido no es correcto ");
                        System.out.println("Presiona ENTER para continuar...");
                        scanner.nextLine();
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por ingrese un numero.");
                scanner.nextLine();
                opcion = -1;
            }
        }while (opcion != 4);


    }
}
