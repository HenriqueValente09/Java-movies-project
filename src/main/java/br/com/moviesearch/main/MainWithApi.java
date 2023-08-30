package br.com.moviesearch.main;

import br.com.moviesearch.models.OmdbTitle;
import br.com.moviesearch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        movie = movie.replace(" ", "-");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?apikey=495026d0&t=" + movie))
                .build();
        String response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        System.out.println(response);
        //Title title = gson.fromJson(response, Title.class);
        OmdbTitle OmdbTitle = gson.fromJson(response, OmdbTitle.class);
        System.out.println(OmdbTitle);
    }
}
