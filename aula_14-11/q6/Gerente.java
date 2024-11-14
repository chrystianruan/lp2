class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return salario * 0.05f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente: " + nome);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Área: " + area);
        System.out.println("Imposto: " + calculaImposto());
    }
}
