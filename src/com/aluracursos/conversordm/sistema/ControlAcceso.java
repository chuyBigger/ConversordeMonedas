package com.aluracursos.conversordm.sistema;

import com.aluracursos.conversordm.modelos.Administradores;

import java.util.List;

public class ControlAcceso {
    private List<Administradores> administradoresRegistrados = List.of(
            new Administradores("Jesus Medina", "chuytec15@gmail.com", "admin123"),
            new Administradores("Admin", "admin@email.com", "admin")
    );

    public boolean validarCredenciales(String correo, String contraseña) {
        return administradoresRegistrados.stream()
                .anyMatch(admin -> admin.getCorreo().equalsIgnoreCase(correo) &&
                        admin.getContraseña().equalsIgnoreCase(contraseña));
    }
}
