package br.com.alura.screenmatch.modelos;

public class Filme {

    private String nome;
    private String genero;
    private String sinopse;
    private String classicacaoIndicativa;
    private int anoDeLancamento;
    private int totalAvaliacaoCriticos;
    private int totalAvaliacaoPublico;
    private int duracaoEmMinutos;
    private boolean inclusoPlano;
    private double mediaAvaliacaoPublico = 0;
    private double mediaAvaliacaoCriticos = 0;
    private double somaAvaliacaoPublico = 0;
    private double somaAvaliacaoCriticos = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getClassicacaoIndicativa() {
        return classicacaoIndicativa;
    }

    public void setClassicacaoIndicativa(String classicacaoIndicativa) {
        this.classicacaoIndicativa = classicacaoIndicativa;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica() {
        System.out.printf("""
                *************************************
                Filme: %s
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
