import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Qual nota você daria para esse filme? Digite -1 para encerrar");
            nota = sc.nextDouble();
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
        }

        System.out.printf("A média de avaliação foi %.2f", media/totalNotas);

    }
}
