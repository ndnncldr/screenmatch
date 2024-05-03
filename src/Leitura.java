import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = sc.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = sc.nextInt();
        System.out.println("Qual nota você daria para esse filme?");
        double avaliacao = sc.nextDouble();
        System.out.println(filme + " lançou em " + anoDeLancamento + ". Você avaliou esse filme com " + avaliacao);


    }
}
