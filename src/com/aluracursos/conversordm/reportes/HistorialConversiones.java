package com.aluracursos.conversordm.reportes;

import com.aluracursos.conversordm.modelos.RegistroConversion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HistorialConversiones {
    private List<RegistroConversion> historial = new ArrayList<>();

    public void agregar(RegistroConversion registro){
        historial.add(registro);
    }

    public void mostrarHistorial(){
        System.out.println("\n ========================  Historial de converiones  =============================");
        int i=0;
        for (RegistroConversion registro : historial ){
            i++;
            System.out.println("[ Registro "+i+".- "+registro+" fecha: ]");
        }
    }

    public  void guardarHistorialComoJson(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss_dd-MM-yyyy");
        String fechaHora = LocalDateTime.now().format(formatter);

        String nombreArchivo = "src/Reportes/RegistrosDeConversiones/"+fechaHora+"_registro_de_conversiones.json";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(nombreArchivo)){
            gson.toJson(historial, writer);
            System.out.println("Historial guardado exitosamente en: "+nombreArchivo);
        }catch (IOException e){
            System.out.println("Error al guardar el historial: "+ e.getMessage());
        }
    }
}
