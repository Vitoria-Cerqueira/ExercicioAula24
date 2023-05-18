package ExercicioUm;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa(1000, 0, 0); // aqui estou instanciando meu objeto
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seu saldo atual é " + caixa.getSaldo()); // aqui estou mostrando meu saldo

        System.out.println("Quantos lançamentos voce deseja fazer? ");
        int lancamento = teclado.nextInt();

        for (int i = 0; i < lancamento; i++) { // aqui estou fazendo um laco de repeticao de acordo com o tanto de lancamento que o usuario perguntar

            System.out.println("informe o valor: ");
            double valorDigitado = teclado.nextDouble();

            System.out.println("Voce deseja: \n 1- Credito \n 2- Debito");
            switch (teclado.nextInt()){
                case 1:
                    caixa.setCredito(valorDigitado); // aqui estou modificando meu atributo credito de acordo com o saldo atual + o que a pessoa digitar
                    caixa.funcaoCredito(); // aqui estou chmando meu metodo/funcao
                    break;

                case 2:
                    caixa.setDebito(valorDigitado);
                    caixa.funcaoDebito();
                    break;

                default:
                    System.out.println("Erro");
                    System.exit(0);
            }
            System.out.println("Seu saldo é " + caixa.getSaldo());
        }


    }
}