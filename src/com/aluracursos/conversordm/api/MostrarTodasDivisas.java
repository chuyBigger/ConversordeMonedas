package com.aluracursos.conversordm.api;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class MostrarTodasDivisas {
    private static String API_KEY = "ae60334ae267f7ad135b4ac7";
    private static String URL_API = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/MXN";

    private static class ApiResponse {
        @SerializedName("conversion_rates") //todo este codigo esta pendiente es el 'MAP'
        Map<String, Double> conversionRates;
    }


    public void mostrarDivisas (){
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL_API))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            System.out.println("Lista de divisas disponibles en la API:");    // -Muestra una lista de 10 en codigos para que sea mas entendible
            int contador = 0;
            StringBuilder fila = new StringBuilder();
            for (String codigo : apiResponse.conversionRates.keySet()){
                fila.append(String.format("%-8s", codigo));
                contador++;

                if (contador % 15 == 0){
                    System.out.println(fila.toString());
                    fila.setLength(0);   // limpia para la siguiente fila
                }

            }
            if (fila.length() > 0 ){
                System.out.println(fila.toString());
            }

        }catch (Exception e){
            System.out.println("Error al obtener las divisas "+e.getMessage());
        }
    }

}
