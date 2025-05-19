package com.aluracursos.conversordm.sistema;

import java.util.Scanner;

public class Iniciar {
   public void iniciaSistema(){
       Scanner scanner = new Scanner(System.in);

       System.out.println("""
                =============================================================
                ********** Sistema Conversor de Monedas 5.3  ****************
                =============================================================
                                       Bienvenido

                       Para continuar selecciona el tipo de 'USUARIO'
                       ( 1 ) Usuario estandar acceso libre a la 'App'
                       ( 2 ) Administrador (REQUIERE USUARIO Y CONTRASEÑA)
                """);
       int opcion = scanner.nextInt();
       scanner.nextLine();
    }
}
