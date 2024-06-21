/**
 * @author joaovictorcmd
 * @date 2024 Jun 21
 */
public class ContaBancaria {
    private int id;
    private String nome;
    private String sobrenome;
    private double saldo;

    public ContaBancaria(int id, String nome, String sobrenome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Desconta do atributo saldo o valor inserido como parâmetro.
     *
     * @param valor
     */

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Não é possível realizar o saque!");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Bancária {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
