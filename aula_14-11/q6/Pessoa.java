abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();
}
