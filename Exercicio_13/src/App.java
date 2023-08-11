import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a sua altura: ");
            double altura = entrada.nextDouble();
            double homem = ((72.7 * altura) - 58);
            double mulher = ((62.1 * altura) - 44.7);
   System.out.println("O peso ideal para homem é: " + homem + "KG");
   System.out.println("O peso ideal para mulher é: " + mulher + "KG");
        }
    }
}
