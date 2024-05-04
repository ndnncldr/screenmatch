import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Labirinto - A Magia do Tempo");
        filme.setAnoDeLancamento(1986);
        filme.setGenero("Aventura");
        filme.setSinopse("""
                Sinopse: Frustrada por ter de cuidar do irmão caçula enquanto seus pais estão fora, a adolescente Sarah (Jennifer Connelly) sonha em se livrar da criança, que não para de chorar. Atendendo seu pedido, o Rei dos Duendes (David Bowie), personagem de um dos livros de Sarah, ganha vida e sequestra o bebê. Arrependida, a menina terá de enfrentar um labirinto e resgatar o irmão antes da meia-noite para evitar que ele seja transformado em um duende.
                """);
        filme.setClassicacaoIndicativa("Livre");
        filme.setDuracaoEmMinutos(101);


        filme.avaliarFilme(8.0, "publico");
        filme.avaliarFilme(5.7, "publico");
        filme.avaliarFilme(10.0, "critico");
        filme.exibirFichaTecnica();

    }
}
