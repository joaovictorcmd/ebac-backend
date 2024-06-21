/**
 * @author joaovictorcmd
 * @date 2024 Jun 21
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("TESTE DA CLASSE");

        ContaBancaria conta = new ContaBancaria(963, "Roberta", "Lima", 5600.00);
        System.out.println(conta);
        System.out.println("Valor inicial da conta => R$" + conta.getSaldo());

        conta.depositar(1000.00);
        System.out.println("Depois do depósito de R$1000.00 => R$" + conta.getSaldo());

        conta.sacar(500.00);
        System.out.println("Depois do saque de R$500.00 => R$" + conta.getSaldo());
    }
}
