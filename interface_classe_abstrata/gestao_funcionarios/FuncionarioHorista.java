class FuncionarioHorista extends Funcionario implement  s Bonus {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + (horasTrabalhadas * valorPorHora) + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return horasTrabalhadas > 160 ? 200.00 : 0.00;
    }
}