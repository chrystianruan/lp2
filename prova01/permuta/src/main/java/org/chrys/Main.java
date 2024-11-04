package org.chrys;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int i = 1;
        while (run) {
            System.out.println("Digite o texto " + i+":");
            String line = scanner.nextLine();
            if (Objects.equals(line, "0")) {
                run = false;
            }
            list.add(line);
            i++;
        }

        mostrarLista(list);
        int tamanhoListaAntes = antes(list);
        int tamanhoListaDepois = depois(list);


        System.out.println("----------------------------------");

        System.out.println("Antes: " + tamanhoListaAntes);
        System.out.println("Depois: " + tamanhoListaDepois);

    }

    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("---------------------------------------------------");
        System.out.println("Sua lista: ");
        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static int antes(ArrayList<String> lista) {
        return lista.size();
    }

    public static int depois(ArrayList<String> lista) {
        lista = null;
        return 0;
    }
}