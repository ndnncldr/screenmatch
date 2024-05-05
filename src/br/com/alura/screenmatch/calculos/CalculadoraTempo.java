package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void adicionar(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
