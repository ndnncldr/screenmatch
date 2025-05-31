package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("Year") String ano,
                         @JsonAlias("Rated") String classificacaoIndicativa,
                         @JsonAlias("Released") String lancamento,
                         @JsonAlias("Runtime") String duracao,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("Director") String diretor,
                         @JsonAlias("Writer") String escritor,
                         @JsonAlias("Actors") String atores,
                         @JsonAlias("Plot") String sinopse,
                         @JsonAlias("Language") String idioma,
                         @JsonAlias("Country") String pais,
                         @JsonAlias("Awards") String premios,
                         @JsonAlias("Poster") String poster,
                         @JsonAlias("Metascore") String pontuacaoMeta,
                         @JsonAlias("imdbRating") String avaliacaoImdb,
                         @JsonAlias("imdbVotes") String votosImdb,
                         @JsonAlias("imdbID") String idImdb,
                         @JsonAlias("totalSeasons") Integer totalTemporadas) {
}
