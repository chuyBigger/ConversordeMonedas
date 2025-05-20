package com.aluracursos.conversordm.reportes;

import com.aluracursos.conversordm.modelos.RegistroModificacion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReporteModificaciones {

    private static final String RUTA_CARPETA = "src/Reportes/RegistrosDeModificaciones";

    public void guardarReporte(List<RegistroModificacion> modificaciones) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(modificaciones);

        String tiempoReal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm"));
        String nombreDelArchivo = RUTA_CARPETA + "reporte_modificaciones_" + tiempoReal + ".json";

        try (FileWriter writer = new FileWriter(nombreDelArchivo)) {
            writer.write(json);

        }
        System.out.println("Reporte modificaciones guardado en: " + nombreDelArchivo);


    }

}
