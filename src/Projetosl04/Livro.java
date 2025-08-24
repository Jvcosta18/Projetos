package Projetosl04;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    private static int totalLivros;

    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.ano = 0;
        totalLivros++;
    }

    public String exibirInfo() {
        return "Título: " + this.titulo +
                ", Autor: " + this.autor +
                ", Ano: " + this.ano;
    }

    public String exibirInfo(boolean resumido) {
        if (resumido) {
            return "Título: " + this.titulo;
        } else {
            return exibirInfo();
        }
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        totalLivros++;
    }



    public static int getTotalLivros() {
        return totalLivros;
    }
}
