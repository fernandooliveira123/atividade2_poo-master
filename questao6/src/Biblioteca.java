import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    Livro [] livro;
    int contador;

    public Biblioteca(int capacidade){
        this.livro = new Livro[capacidade];
    }

    public void adicionarLivro(Livro livro){
        this.livro[this.contador] = livro;
        this.contador++;
    }
    public void emprestarLivro(String titulo){
        for (int i = 0; i < this.livro.length; i++) {
            if (this.livro[i].getTitulo().equals(titulo)) {
                this.livro[i].Emprestar();
            }
        }
    }
    public void devolverLivro(String titulo){
        for (int i = 0; i < this.livro.length; i++) {
            if (this.livro[i].getTitulo().equals(titulo)) {
                this.livro[i].Devolver();
            }
        }
    }
    public void mostrarLivro(){
        for (int i = 0; i < this.livro.length; i++) {
            System.out.println(this.livro[i].getTitulo());
            if (this.livro[i].isDisponivel()){
                System.out.println("Livro disponível");
            }else {
                System.out.println("Livro emprestado");
            }
        }
    }
}
