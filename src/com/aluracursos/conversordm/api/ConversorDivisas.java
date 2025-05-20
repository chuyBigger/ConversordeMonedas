package com.aluracursos.conversordm.api;

import com.aluracursos.conversordm.modelos.RegistroConversion;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDivisas {
    private String API_KEY = "ae60334ae267f7ad135b4ac7";
    private String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public RegistroConversion convertir(String monedaOrigen, String monedaDestino, double monto){

        String direccion = BASE_URL+API_KEY+"pair/"+monedaOrigen+"/"+monedaDestino+"/"+monto;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode()== 200){
                Gson gson = new Gson();
                JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);


                double resultado = jsonResponse.get("conversion_result").getAsDouble();
                String fecha = jsonResponse.get("time_last_update_utc").getAsString();

                return new RegistroConversion(monedaOrigen, monedaDestino, monto, resultado, fecha);

            }else {
                System.out.println("Error al obtener datos de la API codigo: "+response.statusCode());

            }
        }catch (IOException | InterruptedException e ){
            System.out.println("Ocurrio un error al crear la solicitud:"+e.getMessage());
        }
        return new RegistroConversion(monedaOrigen, monedaDestino, monto, 0, "fecha no disponible");
    }
}
