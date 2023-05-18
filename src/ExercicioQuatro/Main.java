package ExercicioQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente pessoaUm = new ContaCorrente(373004, "Vitoria", 20000);

        System.out.println("Saldo atual: " + pessoaUm.getSaldo());
        pessoaUm.depositoConta(500);

        System.out.println("------------------------------------");

        System.out.println("Saldo atual: " + pessoaUm.getSaldo());
        pessoaUm.saqueConta(1000);




        }

    }

