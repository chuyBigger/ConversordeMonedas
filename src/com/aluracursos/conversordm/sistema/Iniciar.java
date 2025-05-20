package com.aluracursos.conversordm.sistema;

import java.util.Scanner;

public class Iniciar {
    public void iniciaSistema() {
        Scanner scanner = new Scanner(System.in);
        EjecucionPrograma programa = new EjecucionPrograma();
        ControlAcceso control = new ControlAcceso();
        MenuAdministrador menuAdmin = new MenuAdministrador();

        System.out.println("""
                =============================================================
                ********** Sistema Conversor de Monedas 5.3  ****************
                =============================================================
                                       Bienvenido
                """);

        int opcion;
        do {
            System.out.println("""
                            Para continuar selecciona el tipo de 'USUARIO' 
                    
                            ( 1 ) Usuario estandar acceso libre a la 'App'
                            ( 2 ) Administrador (REQUIERE USUARIO Y CONTRASEÑA)
                            ( 3 ) Salir
                    
                    ******************************************************************                         
                    
                    """);

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    programa.ejecutarConversor();
                    break;
                case 2:
                    String usuario;
                    do {
                        System.out.println("Ingresa tu correo");
                        usuario = scanner.nextLine();

                        if (!control.existeUsuario(usuario)) {
                            System.out.println("""
                                    El usuario 'No existe' o esta mal escrito
                                    vuelve a intentarlo
                                    """);
                        }
                    } while (!control.existeUsuario(usuario));

                    System.out.println("Ingrese la contraseña");
                    String contraseña = scanner.nextLine();

                    if (control.validarCredenciales(usuario, contraseña)) {
                        menuAdmin.mostrarMenuAdministrador(); // menuAdmin ; // todo lleva la funcion de mostrar el menu del administrador
                    } else {
                        System.out.println("Contraseña incorrecta, Acceso denegado.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema de cambio de monedas! hasta pronto...");
                    break;
                default:
                    System.out.println("Opcion NO VALIDA.");
                    break;

            }

        } while (opcion != 3);

        scanner.close();


    }
}
