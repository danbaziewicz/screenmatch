package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exeptions.YearConvertionErrorException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!search.equals("sair")) {


            System.out.println("Digite o filme que deseja pesquisar: ");
            search = URLEncoder.encode(scan.nextLine(), StandardCharsets.UTF_8);

            if (search.equals("sair")) {
                break;
            }

            String url = "https://www.omdbapi.com/?t=" + search + "&apikey=65fc0c38";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);



                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Titulo convertido");
                System.out.println(myTitle);

                titles.add(myTitle);
            } catch (NumberFormatException e) {
                System.out.println("Erro de conversão numérica na duração: " + e.getMessage());
            } catch (YearConvertionErrorException e) {
                System.out.println("Erro de conversão no ano de lançamento: " + e.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Fim");
    }
}
