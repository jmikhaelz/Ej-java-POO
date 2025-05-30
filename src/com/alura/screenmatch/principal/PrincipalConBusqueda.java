package com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=Ready+Player+One&apikey=[Agregar KEY]"))
                .build();

        HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
