public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        String tipoPlano = "Básico";
        boolean inclusoPlano = false;
        double mediaNota = (9.0 + 8.4 + 1.5)/3;

        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Vale a pena ver de novo!");
        }

        if (inclusoPlano || tipoPlano.equals("Plus")) {
            System.out.println("Este filme está disponível no seu plano!");
        } else {
            System.out.println("Filme não incluso no seu plano, compre o filme ou faça um upgrade do seu plano");
        }

    }
}
