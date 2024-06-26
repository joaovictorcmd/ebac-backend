import java.util.Scanner;

/**
 * @author joaovictorcmd
 * @date 2024 Jun 26
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num = sc.nextDouble();

        Double numeroWrapper = num;
        System.out.println(numeroWrapper);

    }
}
