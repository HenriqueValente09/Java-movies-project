package br.com.moviesearch.main;

import br.com.moviesearch.models.OmdbTitle;
import br.com.moviesearch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithApi {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        movie = movie.replace(" ", "-");
        File file = new File("C:\\Users\\henri\\IdeaProjects\\movies\\movies.txt");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?apikey=495026d0&t=" + movie))
                .build();
        String response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        OmdbTitle omdbTitle = gson.fromJson(response, OmdbTitle.class);
        if (omdbTitle.error() != null) {
            System.out.println(omdbTitle.error());
        } else {
            try {
                Title title = new Title(omdbTitle);
                Writer writer = new FileWriter(file);
                writer.append(response);
                writer.close();
                title.getData();
            } catch (NumberFormatException e) {
                System.out.println("Ocorreu um erro:");
                System.out.println(e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
