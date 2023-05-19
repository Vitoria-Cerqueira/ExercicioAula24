package ExercicioQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaCorrente pessoaUm = new ContaCorrente(373004, "Vitoria", 20000);

        System.out.println("Seu saldo atual é: " + pessoaUm.getSaldo());

        System.out.println("Quantos lançamentos voce quer fazer? " );
        int lancamento = teclado.nextInt();

        for (int i = 0; i < lancamento; i++) {

            System.out.println("Voce deseja: \n 1- Deposito \n 2- Saque");
            switch (teclado.nextInt()){
                case 1:
                    System.out.println("Informe o valor que voce deseja depositar: ");
                    double valorDigitado = teclado.nextDouble();
                    pessoaUm.depositoConta(valorDigitado);

                    System.out.println("Valor atual: " + pessoaUm.getSaldo());
                    break;

                case 2:
                    System.out.println("Informe o valor que voce deseja sacar: ");
                    double valorDigitado1 = teclado.nextDouble();
                    pessoaUm.saqueConta(valorDigitado1);

                    System.out.println("Valor atual: " + pessoaUm.getSaldo());
                    break;

                default:
                    System.out.println("Erro");
                    System.exit(0);


            }
        }

    }

}

