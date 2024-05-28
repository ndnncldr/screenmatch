package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.ErroConversaoAnoLancamento;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalBuscaAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Qual o filme que deseja assistir?");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = String.format("https://www.omdbapi.com/?t=%s&apikey=484552e4", busca);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco.replace(" ", "%20")))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            try {
                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TituloOmdb tituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println(titulo);

                titulos.add(titulo);

                //grava em um arquivo

            } catch (NullPointerException e) {
                System.out.println("Filme não encontrado!");
                System.out.println(e.getMessage());
                break;
            } catch (ErroConversaoAnoLancamento e) {
                System.out.println(e.getMessage());
                break;
            } finally {
                System.out.println("Fim do programa");
            }

        }
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("filmesBuscados.json", false);
        String registro = gson.toJson(titulos);
        escrita.write(registro);
        escrita.close();
        System.out.println(titulos);

    }
}
