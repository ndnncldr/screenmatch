public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Labirinto - A Magia do Tempo";
        filme.anoDeLancamento = 1986;
        filme.genero = "Aventura";
        filme.sinopse = """
                Sinopse: Frustrada por ter de cuidar do irmão caçula enquanto seus pais estão fora, a adolescente Sarah (Jennifer Connelly) sonha em se livrar da criança, que não para de chorar. Atendendo seu pedido, o Rei dos Duendes (David Bowie), personagem de um dos livros de Sarah, ganha vida e sequestra o bebê. Arrependida, a menina terá de enfrentar um labirinto e resgatar o irmão antes da meia-noite para evitar que ele seja transformado em um duende.
                """;
        filme.classicacaoIndicativa = "Livre";
        filme.totalAvaliacaoCriticos = 3;
        filme.duracaoEmMinutos = 101;
        filme.inclusoPlano = true;
        filme.avaliacaoCriticos = (8 + 5.7 + 10)/filme.totalAvaliacaoCriticos;
        System.out.println(filme.avaliacaoCriticos);

        filme.exibeFichaTecnica();
        filme.mediaAvaliacaoUsuario(8.0);
        filme.mediaAvaliacaoUsuario(5.7);
        filme.mediaAvaliacaoUsuario(10.0);
        System.out.println(filme.getMediaAvaliacaoUsuario());
    }
}
