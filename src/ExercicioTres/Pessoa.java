package ExercicioTres;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa (String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    public double getPeso(){
        return peso;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    public void setAltura(double valor) {
        this.altura += valor;
    }

    public void setIdade(int idade) {
        this.idade += idade;
    }
}
