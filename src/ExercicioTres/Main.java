package ExercicioTres;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaUm = new Pessoa("Vitoria", 5, 50, 1.59);

        System.out.println("Nome: " + pessoaUm.getNome());
        System.out.println("Altura atual: " + pessoaUm.getAltura());
        System.out.println("Idade atual " + pessoaUm.getIdade());
        System.out.println("-------------------------");

        for (int i = 0; pessoaUm.getIdade() <21; i++) {
            pessoaUm.setAltura(0.5);
                System.out.println("-------------------------");
                pessoaUm.setIdade(1);
                System.out.println(pessoaUm.getNome());
                System.out.println(pessoaUm.getIdade() + " anos");
                System.out.println(pessoaUm.getAltura() + "cm");
                System.out.println(pessoaUm.getPeso() + "kg");

                if (pessoaUm.getIdade() == 22){
                    System.out.println(pessoaUm.getIdade());
                    System.out.println(pessoaUm.getAltura());
                    System.out.println(pessoaUm.getPeso());
                    System.out.println(pessoaUm.getNome());
                }

        }





    }
}
