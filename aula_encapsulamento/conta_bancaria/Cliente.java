public class Cliente {
    private String nome;
    private String cpf;
    private String password;

    public Cliente(String nome, String cpf, String password) {
        this.nome = nome;
        this.cpf = cpf;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
