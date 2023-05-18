package ExercicioSeis;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Lado atual: " + quadrado.getLadoA());



        quadrado.setLadoA(10);
        System.out.println("Lado atualizado " + quadrado.getLadoA());
        System.out.println("Calculo da area: " + quadrado.calcularArea());

    }
}
