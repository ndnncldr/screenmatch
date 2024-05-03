import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual nota você daria para esse filme?");
            nota = sc.nextDouble();
            media += nota;
        }

        System.out.printf("A média de avaliação foi %.2f", media/3);

    }

}
