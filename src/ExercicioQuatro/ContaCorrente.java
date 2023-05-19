package ExercicioQuatro;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositoConta(double valorDigiado){
        return saldo += valorDigiado;
    }

    public double saqueConta(double valor){
        if (valor > saldo){
            System.err.println("Saldo insuficiente");
            System.exit(0);
        }
        return saldo -= valor;
    }
}
