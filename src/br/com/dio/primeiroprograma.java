package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {
    public static void main(String[] args) {

        Livro livro = new Livro("O Probelma do Danilo", 300);
        Gato gato = new Gato();
        System.out.println(gato);
        System.out.println(livro);

         /*
        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println("Hello World! " + c);
        */
    }
}
class Livro{
    private String nome;
    private Integer numpag;

    public Livro(String nome, Integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag=" + numpag +
                '}';
    }
}