package Projetosl04.exe01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        funcionario[] funcionarios = new funcionario[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Cadastro do funcionário " + (i + 1) + ":");

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();


           funcionarios[i] = new funcionario(nome , salario);

        }

        System.out.println("\n===== RESULTADOS =====");
        for (int i = 0; i < N; i++) {
            System.out.println("nome : " + funcionarios[i].getNome());
            System.out.println("salario  : " + funcionarios[i].getSalario());
           funcionarios[i].calcularIRPF();

        }

        scanner.close();
    }
}