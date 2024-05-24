package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme filme = new Filme("Labirinto - A Magia do Tempo", 1986);
        Filme filme1 = new Filme("Coringa", 2019);
        Serie serie = new Serie("Doctor Who (2005-2022)", 2005);
        Serie serie1 = new Serie("Vikings", 2013);
        ArrayList<Titulo> titulosAssistidos = new ArrayList<>();

        filme.avaliar(8.0, "publico");
        filme.avaliar(5.7, "publico");
        filme.avaliar(10.0, "critico");
        filme1.avaliar(8.0, "publico");
        filme1.avaliar(5.7, "publico");
        filme1.avaliar(10.0, "critico");
        serie.avaliar(8.0, "publico");
        serie.avaliar(5.7, "publico");
        serie.avaliar(10.0, "critico");
        serie1.avaliar(8.0, "publico");
        serie1.avaliar(5.7, "publico");
        serie1.avaliar(10.0, "critico");
        serie1.avaliar(10.0, "critico");

        titulosAssistidos.add(filme);
        titulosAssistidos.add(filme1);
        titulosAssistidos.add(serie);
        titulosAssistidos.add(serie1);

        for (Titulo titulo : titulosAssistidos) {
            System.out.println("Título: " + titulo.getNome());
            if (titulo instanceof Filme f) {
                System.out.println("Classificação do público: " + f.getClassificacaoPublico());
                System.out.println("Classificação dos críticos: " + f.getClassificacaoCritico());

            }
        }

        List<String> buscaPorAtores = new ArrayList<>();
        buscaPorAtores.add("Tom Hanks");
        buscaPorAtores.add("Tom Cruise");
        buscaPorAtores.add("Leonardo DiCaprio");
        buscaPorAtores.add("Denzel Washington");
        buscaPorAtores.add("Chris Pine");
        buscaPorAtores.add("Chris Evans");
        System.out.println("Antes do sort: " + buscaPorAtores);

        Collections.sort(buscaPorAtores);
        System.out.println("Depois do sort: " + buscaPorAtores);
//        Collections.sort(titulosAssistidos);
        System.out.println("Por nome: " + titulosAssistidos);
//        titulosAssistidos.sort(Comparator.comparing(Title::getYear));
        System.out.println("Por data: " + titulosAssistidos);


    }
}
