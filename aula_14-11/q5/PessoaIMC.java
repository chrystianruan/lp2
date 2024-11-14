abstract class PessoaIMC extends Pessoa {
    protected double peso;
    protected double altura;

    public PessoaIMC() {
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return "Peso: " + peso + ", Altura: " + altura;
    }
}