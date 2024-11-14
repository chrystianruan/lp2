import java.util.ArrayList;
import java.util.List;

class CadastroPessoas {
    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pess) {
        pessoas.add(pess);
    }

    public void imprimeCadastro() {
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimeDados();
            System.out.println();
        }
    }
}


