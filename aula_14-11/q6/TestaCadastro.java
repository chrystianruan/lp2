public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        Cliente c1 = new Cliente("Cliente 1", new Data(10, 5, 1985), 101);
        Cliente c2 = new Cliente("Cliente 2", new Data(15, 7, 1990), 102);
        Cliente c3 = new Cliente("Cliente 3", new Data(20, 3, 1988), 103);

        Funcionario f1 = new Funcionario("Funcionario 1", new Data(5, 6, 1980), 3000);
        Funcionario f2 = new Funcionario("Funcionario 2", new Data(8, 11, 1975), 3500);
        Funcionario f3 = new Funcionario("Funcionario 3", new Data(12, 1, 1982), 4000);

        Gerente g1 = new Gerente("Gerente 1", new Data(2, 2, 1970), 5000, "Financeiro");
        Gerente g2 = new Gerente("Gerente 2", new Data(9, 9, 1965), 5500, "RH");
        Gerente g3 = new Gerente("Gerente 3", new Data(4, 4, 1978), 6000, "Vendas");

        cadastro.cadastraPessoa(c1);
        cadastro.cadastraPessoa(c2);
        cadastro.cadastraPessoa(c3);

        cadastro.cadastraPessoa(f1);
        cadastro.cadastraPessoa(f2);
        cadastro.cadastraPessoa(f3);

        cadastro.cadastraPessoa(g1);
        cadastro.cadastraPessoa(g2);
        cadastro.cadastraPessoa(g3);

        cadastro.imprimeCadastro();
    }
}