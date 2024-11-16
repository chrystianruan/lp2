abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularPagamento();

    public void exibirSalario() {
        System.out.println("Pagamento total para " + nome + ": R$" + calcularPagamento());
    }
}