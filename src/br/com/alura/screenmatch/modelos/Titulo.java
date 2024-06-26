package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private String genero;
    private String sinopse;
    private String classicacaoIndicativa;
    private int anoDeLancamento;
    private int totalAvaliacaoCriticos;
    private int totalAvaliacaoPublico;
    private boolean inclusoPlano;
    private int duracaoEmMinutos;
    private double mediaAvaliacaoPublico;
    private double mediaAvaliacaoCriticos;
    private double somaAvaliacaoPublico;
    private double somaAvaliacaoCriticos;

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

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
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

                """, nome, anoDeLancamento, genero, classicacaoIndicativa, sinopse,
                totalAvaliacaoPublico, mediaAvaliacaoPublico, totalAvaliacaoCriticos, mediaAvaliacaoCriticos);
    }

    public void avaliarFilme(double nota, String tipoUsuario) {
        if (!tipoUsuario.equals("publico") && !tipoUsuario.equals("critico")) {
            System.out.println("Tipo de usuário inválido.");
            return;
        }

        somarAvaliacaoFilme(nota, tipoUsuario);

        if (tipoUsuario.equals("publico")) {
            mediaAvaliacaoPublico = somaAvaliacaoPublico/totalAvaliacaoPublico;
        } else {
            mediaAvaliacaoCriticos = somaAvaliacaoCriticos/totalAvaliacaoCriticos;
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

}
