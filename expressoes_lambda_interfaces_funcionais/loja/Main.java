import java.util.*;
import java.util.stream.Collectors;

public class Loja {

    public static List<Pessoa> filtrarPessoasPorIdade(List<Pessoa> pessoas, int idadeMinima) {
        return pessoas.stream()
                .filter(p -> p.getIdade() > idadeMinima)
                .collect(Collectors.toList());
    }

    public static List<Pessoa> ordenarPessoasPorNome(List<Pessoa> pessoas) {
        return pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList());
    }

    public static List<Pessoa> aplicarDesconto(List<Pessoa> pessoas, Desconto desconto) {
        return pessoas.stream()
                .map(p -> {
                    p.setSalario(desconto.aplicar(p));
                    return p;
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 25, 3000.0),
                new Pessoa("Bruno", 35, 4000.0),
                new Pessoa("Carlos", 30, 3500.0),
                new Pessoa("Diana", 40, 4500.0)
        );

        List<Pessoa> pessoasFiltradas = filtrarPessoasPorIdade(pessoas, 30);
        System.out.println("Pessoas com idade maior que 30:");
        pessoasFiltradas.forEach(System.out::println);

        List<Pessoa> pessoasOrdenadas = ordenarPessoasPorNome(pessoas);
        System.out.println("\nPessoas ordenadas por nome:");
        pessoasOrdenadas.forEach(System.out::println);

        Desconto desconto = pessoa -> pessoa.getIdade() > 30
                ? pessoa.getSalario() * 0.9
                : pessoa.getSalario();

        List<Pessoa> pessoasComDesconto = aplicarDesconto(pessoas, desconto);
        System.out.println("\nPessoas com salário atualizado (desconto aplicado):");
        pessoasComDesconto.forEach(System.out::println);
    }
}
