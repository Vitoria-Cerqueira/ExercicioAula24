package ExercicioUm;

public class Caixa {
    private double saldo;
    private double credito;
    private double debito;

    public Caixa(double saldo, double credito, double debito){ // criando um construtor, para tornar o atributo publico
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }
    public double getSaldo() { // aqui estou pegando o atributo e retornando o que está publico
        return saldo;
    }


    public void setCredito(double credito) { // e aqui estou modificando esse atributo que ficou publico
        this.credito = credito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }


    public double funcaoCredito(){ // aqui estou dando funcionalidade parab minha funcao credito
        return saldo += credito;
    }

    public double funcaoDebito(){
        return saldo -= debito;
    }

}
