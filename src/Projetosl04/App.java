package Projetosl04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = 3;
        Livro[] livros = new Livro[N];


        for (int i = 0; i < N; i++) {
            System.out.println("Cadastro do livro " + (i + 1) + ":");

            System.out.println(" Digite o titulo do livro.");
            String titulo = scanner.nextLine();
            System.out.println(" Digite o nome do ator. ");
            String autor = scanner.nextLine();
            System.out.println(" digite o ano de publicacao ");
            int ano = scanner.nextInt();
            scanner.nextLine();

             livros[i] = new Livro(titulo, autor, ano);
        }


        System.out.println("\n--- Informações dos Livros ---");
        for (int i = 0; i < N; i++) {
            System.out.println(livros[i].exibirInfo());
        }


         System.out.println("Total de livros: " + Livro.getTotalLivros());

        System.out.println(" primeiro livro ");
         System.out.println(livros[0].exibirInfo(true));

        scanner.close();
    }
}
