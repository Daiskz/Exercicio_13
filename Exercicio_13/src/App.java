import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a sua altura: ");
            double a = entrada.nextDouble();
            double h = ((72.7 * a) - 58);
            double m = ((62.1 * a) - 44.7);
   System.out.println("O peso ideal para homem é: " + h + "KG");
   System.out.println("O peso ideal para mulher é: " + m + "KG");
        }
    }
}
