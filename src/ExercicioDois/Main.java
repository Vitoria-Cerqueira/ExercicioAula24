package ExercicioDois;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Bola bolaBasquete = new Bola(80,200, "Vermelho", "NBA", "couro sintetico");
        Bola bolaFutebol = new Bola(69,170, "Branca", "nike", "couro sintetico");
        Bola bolaVolei = new Bola(75,150, "Laranja", "adidas", "couro sintetico");

        System.out.println("A cor atual da bola de Volei é " + bolaVolei.getCor());
        System.out.println("A cor atual da bola de Futebol " + bolaFutebol.getCor());
        System.out.println("A cor atual da bola de Basquete " + bolaBasquete.getCor());

        System.out.println("-------------------------------------------");

        System.out.println("Voce deseja alterar para qual cor a bola de Volei? ");
        bolaVolei.setCor(teclado.next());

        System.out.println("Voce deseja alterar para qual cor a bola de Basquete? ");
        bolaBasquete.setCor(teclado.next());

        System.out.println("Voce deseja alterar para qual cor a bola de Futebol? ");
        bolaFutebol.setCor(teclado.next());

        System.out.println("-------------------------------------------");

        System.out.println("A cor atual da bola de Volei " + bolaVolei.getCor());
        System.out.println("A cor atual da bola de Futebol " + bolaBasquete.getCor());
        System.out.println("A cor atual da bola de Basquete " + bolaFutebol.getCor());



    }
}
