package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacaoCritico() >= 4 && classificavel.getClassificacaoPublico() >= 4){
            System.out.println("Amado pelo publico e queridinho dos críticos!");
        } else {
            System.out.println("Coloque na lista e assista mais tarde!");
        }
    }

}
