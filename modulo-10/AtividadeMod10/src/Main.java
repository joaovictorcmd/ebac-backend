import java.util.Scanner;

/**
 * @author joaovictorcmd
 * @date 2024 Jun 26
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a nota 4:");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String situacao;

        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 6) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao.toUpperCase());
    }
}
