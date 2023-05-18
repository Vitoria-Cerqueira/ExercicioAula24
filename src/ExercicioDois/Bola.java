package ExercicioDois;

public class Bola {
    private double circunferencia;
    private double velocidade;
    private String cor;
    private String marca;
    private String material;

    public Bola(double circunferencia, double velocidade, String cor, String marca, String material){

        this.circunferencia = circunferencia;
        this.velocidade = velocidade;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
    }

    public String getCor() { // estou usando o get para mostrar a cor
        return cor;
    }

    public void setCor(String cor) { // estou usando o set para trocar a cor
        this.cor = cor;
    }


}
