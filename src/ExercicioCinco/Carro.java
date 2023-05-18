package ExercicioCinco;

public class Carro {
    private int qtaPortas;
    private  String modelo;
    private String marca;
    private double potencia;

    public Carro(int qtaPortas, String modelo, String marca, double potencia){
        this.qtaPortas = qtaPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public boolean ligarCarro(){
        System.out.println("Carro ligado");
        return true;
    }

    public int getQtaPortas() {
        return qtaPortas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
