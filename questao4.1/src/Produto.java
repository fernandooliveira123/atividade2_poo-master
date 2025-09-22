public class Produto {
    private String Nome;
    private double Preço;

    public Produto(String nome, double Preço){
        Nome = nome;
        Preço = Preço;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPreço() {
        return Preço;
    }

    public void setPreço(double preço) {
        if (Preço <0) {
            System.out.println("Preço inválido");
            return;
        }
        preço = preço;
    }
}