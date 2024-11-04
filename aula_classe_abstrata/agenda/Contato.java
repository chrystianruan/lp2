abstract class Contato {
    protected String nome;
    protected String endereco;
    protected String email;

    public Contato(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public abstract String getIdentificador(); // CPF ou CNPJ

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}