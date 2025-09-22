public class Main {
    public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Mario", 41, new Endereco("Rua 1", 120));
    p1.mostraDados();
    Pessoa p2 = new Pessoa("Joao",22, new Endereco("Rua 2",21) );
    p2.mostraDados();
    }
}
