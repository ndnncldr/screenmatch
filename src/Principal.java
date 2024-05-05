import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Labirinto - A Magia do Tempo");
        filme.setAnoDeLancamento(1986);
        filme.setGenero("Aventura");
        filme.setSinopse("""
                Frustrada por ter de cuidar do irmão caçula enquanto seus pais estão fora,
                a adolescente Sarah (Jennifer Connelly) sonha em se livrar da criança, que não para
                de chorar. Atendendo seu pedido, o Rei dos Duendes (David Bowie), personagem de um
                dos livros de Sarah, ganha vida e sequestra o bebê. Arrependida, a menina terá de
                enfrentar um labirinto e resgatar o irmão antes da meia-noite para evitar que ele
                seja transformado em um duende.
                """);
        filme.setClassicacaoIndicativa("Livre");
        filme.setDuracaoEmMinutos(101);
        filme.avaliarFilme(8.0, "publico");
        filme.avaliarFilme(5.7, "publico");
        filme.avaliarFilme(10.0, "critico");
        filme.exibirFichaTecnica();

        Serie serie = new Serie();
        serie.setNome("Doctor Who (2005-2022)");
        serie.setAnoDeLancamento(2005);
        serie.setSinopse("""
                O Doutor é um Senhor do Tempo - um alien de um planeta distante chamado Gallifrey
                que tem dois corações e aproximadamente 900 anos. Em sua nave espacial, a TARDIS,
                ele atravessa as barreiras do espaço e do tempo lutando contra inimigos e criando
                aventuras com seus companheiros, que sempre escolhe para viajar junto a ele. Quando
                ele está prestes a morrer, ele se regenera e renasce em outro corpo inteiramente novo.\s
                """);
        serie.setGenero("Sci-fi");
        serie.setClassicacaoIndicativa("A10");
        serie.setTemporadas(13);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(50);
        serie.setAtiva(false);
        System.out.println(serie.getDuracaoEmMinutos());

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.adicionar(filme);
        calculadora.adicionar(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtrar(serie);

        Episodio episodio = new Episodio();
        episodio.setNomeEpisodio("Blink");
        episodio.setNumeroEpisodio(10);
        episodio.setSerie(serie);
        filtroRecomendacao.filtrar(episodio);
        episodio.exibirInformacaoEpisodio();


    }
}
