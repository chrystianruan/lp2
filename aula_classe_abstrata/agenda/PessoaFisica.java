class PessoaFisica extends Contato {
    private String cpf;
    private String dataNascimento;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNascimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}