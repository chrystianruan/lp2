class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return salario * 0.03f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Imposto: " + calculaImposto());
    }
}