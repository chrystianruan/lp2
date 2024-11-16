class FuncionarioAssalariado extends Funcionario implements Bonus {
    public FuncionarioAssalariado(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10; // 10% de bônus
    }
}