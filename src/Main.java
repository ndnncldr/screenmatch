public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Screen Match te dá boas vindas ;)");
        String filme = "Interestelar";

        int anoDeLancamento = 2014;
        boolean inclusoPlano = false;


        double mediaNota = (9.0 + 8.4 + 1.5)/3;
        System.out.println("A nota do filme entre os usuários do screen match é de " + mediaNota);
        String sinopse = "Após ver a Terra consumindo boa parte de suas reservas naturais, um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper (Matthew McConaughey) é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos. Ao lado de Brand (Anne Hathaway), Jenkins (Marlon Sanders) e Doyle (Wes Bentley), ele seguirá em busca de uma nova casa. Com o passar dos anos, sua filha Murph (Mackenzie Foy e Jessica Chastain) investirá numa própria jornada para também tentar salvar a população do planeta.";

        String informacoesFilme = """
                Filme: %s
                Sinopse: Após ver a Terra consumindo boa parte de suas reservas naturais, um grupo de astronautas recebe a
                missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da
                espécie. Cooper (Matthew McConaughey) é chamado para liderar o grupo e aceita a missão sabendo que pode
                nunca mais ver os filhos. Ao lado de Brand (Anne Hathaway), Jenkins (Marlon Sanders) e Doyle (Wes Bentley),
                ele seguirá em busca de uma nova casa. Com o passar dos anos, sua filha Murph (Mackenzie Foy e Jessica
                Chastain) investirá numa própria jornada para também tentar salvar a população do planeta.
                Ano de lançamento: %d
                
                A nota do filme entre os usuários do screen match é de %.2f
               
                *Filme não está incluso no seu plano.
                """.formatted(filme, anoDeLancamento, mediaNota);
        System.out.println(informacoesFilme);

        int estrelas = (int) (mediaNota/2);
        System.out.println(estrelas);

    }
}