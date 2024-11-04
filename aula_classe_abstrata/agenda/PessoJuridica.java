class PessoaJuridica extends Contato {
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, String inscricaoEstadual, String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Razão Social: " + razaoSocial);
    }
}