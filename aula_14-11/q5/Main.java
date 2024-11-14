import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<PessoaIMC> pessoas = new Vector<>();

        Homem h1 = new Homem();
        h1.peso = 70;
        h1.altura = 1.75;
        pessoas.add(h1);

        Mulher m1 = new Mulher();
        m1.peso = 60;
        m1.altura = 1.65;
        pessoas.add(m1);

        for (PessoaIMC pessoa : pessoas) {
            System.out.println(pessoa.toString());
            System.out.println("IMC: " + pessoa.calculaIMC(pessoa.getPeso(), pessoa.getAltura()));
            System.out.println("Resultado: " + pessoa.resultIMC());
            System.out.println();
        }
    }
}
