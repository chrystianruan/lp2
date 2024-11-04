import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new PessoaFisica("João Silva", "Rua A, 123", "joao@email.com", "123.456.789-00", "01/01/1980", "Solteiro"));
        agenda.adicionarContato(new PessoaJuridica("Empresa XYZ", "Av. B, 456", "contato@xyz.com", "12.345.678/0001-99", "123456789", "XYZ Ltda"));
        agenda.adicionarContato(new PessoaFisica("Maria Santos", "Rua C, 789", "maria@email.com", "234.567.890-11", "02/02/1990", "Casada"));
        agenda.adicionarContato(new PessoaJuridica("Empresa ABC", "Av. D, 123", "contato@abc.com", "98.765.432/0001-55", "987654321", "ABC S.A"));

        System.out.println("\nContatos antes da ordenação:");
        agenda.listarContatos();

        agenda.ordena();

        System.out.println("\nContatos após a ordenação:");
        agenda.listarContatos();
    }
}
