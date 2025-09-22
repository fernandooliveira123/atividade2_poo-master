public class Main {
    public static void main(String[] args) throws Exception {

        Produto Uva = new Produto("Uva", 4.50);
        Uva.setPreço(-1);

        Produto Maça = new Produto("Maça", 3.40);
        Maça.setPreço(-4);

        Produto Laranja = new Produto("Laranja", 1.20);
        Laranja.setPreço(-2);
    }
}