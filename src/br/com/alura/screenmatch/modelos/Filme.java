package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private double bilheteria;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public double getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(double bilheteria) {
        this.bilheteria = bilheteria;
    }

    @Override
    public int getClassificacaoPublico() {
        return (int) getMediaAvaliacaoPublico()/2;
    }

    @Override
    public int getClassificacaoCritico() {
        return (int) getMediaAvaliacaoCriticos()/2;
    }

    @Override
    public String toString() {
        return "Filme: %s (%d)".formatted(this.getNome(), this.getAnoDeLancamento());
    }
}
