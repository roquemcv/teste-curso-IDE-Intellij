package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    private static Integer numPaginas;

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        String nome;
        Livro livro1 = new Livro(nome = "O problema dos 3 corpos", numPaginas =300);
        System.out.println(livro1);
      /*  int a = 5;
        int b = 3;
        int c = 2;

        System.out.println("Hello, World!!!" + (a+b));*/
    }

}

class Livro {
    public String nome;
    public Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}