package Projetosl04.exe01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 5;
        funcionario[] funcionarios = new funcionario[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Cadastro do funcionário " + (i + 1) + ":");

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();


            funcionarios[i] = new funcionario();
            funcionarios[i].setNome(nome);
            funcionarios[i].setSalario(salario);

        }

        System.out.println("\n===== RESULTADOS =====");
        for (funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.printf("Salário: R$ %.2f\n", f.getSalario());
            f.calcularIRPF();
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}