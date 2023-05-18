package ExercicioCinco;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro(4, "Kwid", "Renault", 2.0);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQtaPortas());

        carro.ligarCarro();

    }
}
