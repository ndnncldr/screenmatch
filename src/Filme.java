public class Filme {

    String nome;
    String genero;
    String sinopse;
    String classicacaoIndicativa;
    int anoDeLancamento;
    int totalAvaliacaoCriticos;
    int totalAvaliacaoUsuarios;
    int duracaoEmMinutos;
    boolean inclusoPlano;
    double avaliacaoUsuarios = 0;
    double avaliacaoCriticos;
    double somaAvaliacao = 0;


    void exibeFichaTecnica() {
        System.out.printf("""
                *************************************
                Filme: %s
                Ano de lançamento: %d
                *************************************

                """, nome, anoDeLancamento);
    }

    void mediaAvaliacaoUsuario(double nota) {
        somaAvaliacao += nota;
        totalAvaliacaoUsuarios++;
    }

    double getMediaAvaliacaoUsuario() {
        avaliacaoUsuarios = somaAvaliacao/totalAvaliacaoUsuarios;
        return avaliacaoUsuarios;
    }
}
