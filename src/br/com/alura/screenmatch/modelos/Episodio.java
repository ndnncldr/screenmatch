package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private String nomeEpisodio;
    private int numeroEpisodio;
    private Serie serie;

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacaoPublico() {
        return 5;
    }

    @Override
    public int getClassificacaoCritico() {
        return 4;
    }

    public void exibirInformacaoEpisodio(){
        System.out.printf("""
                
                *************************************
                Episódio: %s
                Numero do episódio: %d
                Série: %s
                *************************************

                """, nomeEpisodio, numeroEpisodio, serie.getNome());
    }

}
