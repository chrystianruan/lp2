public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }
}