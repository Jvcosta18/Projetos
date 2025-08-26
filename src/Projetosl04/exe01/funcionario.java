package Projetosl04.exe01;

public class funcionario {
    private String nome;
    private double salario;

    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void calcularIRPF() {
        double imposto = 0.0;

        if (salario <= 1903.98) {
            imposto = 0.0;
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;

        } else if (salario <= 3751.05) {
            imposto = (2826.65 - 1903.98) * 0.075 +
                    (salario - 2826.65) * 0.15;

        } else if (salario <= 4664.68) {
            imposto = (2826.65 - 1903.98) * 0.075 +
                    (3751.05 - 2826.65) * 0.15 +
                    (salario - 3751.05) * 0.225;

        } else {
            imposto = (2826.65 - 1903.98) * 0.075 +
                    (3751.05 - 2826.65) * 0.15 +
                    (4664.68 - 3751.05) * 0.225 +
                    (salario - 4664.68) * 0.275;
        }
        System.out.printf("Imposto de Renda: R$ %.2f%n", imposto);
    }
}




