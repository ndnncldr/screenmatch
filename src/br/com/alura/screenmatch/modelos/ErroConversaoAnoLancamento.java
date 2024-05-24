package br.com.alura.screenmatch.modelos;

public class ErroConversaoAnoLancamento extends RuntimeException {
    private String mensagemErro;

    public ErroConversaoAnoLancamento(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public String getMessage() {
        return mensagemErro;
    }

}
