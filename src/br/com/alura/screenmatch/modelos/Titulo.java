package br.com.alura.screenmatch.modelos;

public class Titulo {

    private final String nome;
    private String genero;
    private String sinopse;
    private String classicacaoIndicativa;
    private final int anoDeLancamento;
    private int totalAvaliacaoCriticos;
    private int totalAvaliacaoPublico;
    private boolean inclusoPlano;
    private int duracaoEmMinutos;
    private double mediaAvaliacaoPublico;
    private double mediaAvaliacaoCriticos;
    private double somaAvaliacaoPublico;
    private double somaAvaliacaoCriticos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();


//        if(tituloOmdb.year().length() > 4) {
//            throw new ErroConversaoAnoLancamento("Erro ao converter o ano de lançamento: " + tituloOmdb.year());
//        }

        this.anoDeLancamento = Integer.parseInt(String.valueOf(tituloOmdb.year().substring(0, 4 )));
        this.classicacaoIndicativa = tituloOmdb.rated();
        this.genero = tituloOmdb.genre();
        this.sinopse = tituloOmdb.plot();
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getMediaAvaliacaoPublico() {
        return mediaAvaliacaoPublico;
    }

    public double getMediaAvaliacaoCriticos() {
        return mediaAvaliacaoCriticos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setClassicacaoIndicativa(String classicacaoIndicativa) {
        this.classicacaoIndicativa = classicacaoIndicativa;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void exibirFichaTecnica() {
        System.out.printf("""
                *************************************
                Título: %s
                Ano de lançamento: %d
                Gênero: %s
                Classificação indicativa: %s
                Sinopse: %s
                Avaliação público (%d avaliações): %.2f
                Avaliação críticos (%d avaliações): %.2f
                *************************************

                """, nome, anoDeLancamento, genero, classicacaoIndicativa, sinopse, totalAvaliacaoPublico, mediaAvaliacaoPublico, totalAvaliacaoCriticos, mediaAvaliacaoCriticos);
    }

    public void avaliar(double nota, String tipoUsuario) {
        if (!tipoUsuario.equals("publico") && !tipoUsuario.equals("critico")) {
            System.out.println("Tipo de usuário inválido.");
            return;
        }

        somarAvaliacaoFilme(nota, tipoUsuario);

        if (tipoUsuario.equals("publico")) {
            mediaAvaliacaoPublico = somaAvaliacaoPublico / totalAvaliacaoPublico;
        } else {
            mediaAvaliacaoCriticos = somaAvaliacaoCriticos / totalAvaliacaoCriticos;
        }

    }

    public void somarAvaliacaoFilme(double nota, String tipoUsuario) {
        if (tipoUsuario.equals("publico")) {
            somaAvaliacaoPublico += nota;
            totalAvaliacaoPublico++;
        } else {
            somaAvaliacaoCriticos += nota;
            totalAvaliacaoCriticos++;
        }
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", classicacaoIndicativa='" + classicacaoIndicativa + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", totalAvaliacaoCriticos=" + totalAvaliacaoCriticos +
                ", totalAvaliacaoPublico=" + totalAvaliacaoPublico +
                ", inclusoPlano=" + inclusoPlano +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", mediaAvaliacaoPublico=" + mediaAvaliacaoPublico +
                ", mediaAvaliacaoCriticos=" + mediaAvaliacaoCriticos +
                ", somaAvaliacaoPublico=" + somaAvaliacaoPublico +
                ", somaAvaliacaoCriticos=" + somaAvaliacaoCriticos +
                '}';
    }
}
