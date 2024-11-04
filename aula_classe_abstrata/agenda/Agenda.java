class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String identificador) {
        Contato contato = buscarContatoPorIdentificador(identificador);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void buscarContatoPorNome(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.exibirInformacoes();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum contato encontrado com o nome: " + nome);
        }
    }

    public Contato buscarContatoPorIdentificador(String identificador) {
        for (Contato contato : contatos) {
            if (contato.getIdentificador().equals(identificador)) {
                return contato;
            }
        }
        System.out.println("Nenhum contato encontrado com o identificador: " + identificador);
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
        } else {
            for (Contato contato : contatos) {
                contato.exibirInformacoes();
                System.out.println("-----------------------------");
            }
        }
    }

    public void ordena() {
        for (int i = 1; i < contatos.size(); i++) {
            Contato key = contatos.get(i);
            int j = i - 1;
            while (j >= 0 && compare(contatos.get(j), key) > 0) {
                contatos.set(j + 1, contatos.get(j));
                j = j - 1;
            }
            contatos.set(j + 1, key);
        }
        System.out.println("Contatos ordenados com sucesso!");
    }

    private int compare(Contato a, Contato b) {
        // pessoas fisicas antes das juridicas
        if (a instanceof PessoaFisica && b instanceof PessoaJuridica) {
            return -1;
        }
        if (a instanceof PessoaJuridica && b instanceof PessoaFisica) {
            return 1;
        }

        // ordenar por CPF ou CNPJ
        return a.getIdentificador().compareTo(b.getIdentificador());
    }
}