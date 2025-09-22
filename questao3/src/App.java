public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria(423,1000);
        System.out.println("Numero da Conta: "+ conta.getNumerodaconta() + " Saldo em conta:" +conta.getSaldo());
        conta.depositar(100);
        System.out.println("numero da conta: "+ conta.getNumerodaconta()+ " depositar 100" +" Saldo em conta: " +conta.getSaldo()) ;
        conta.sacar(50);
        System.out.println("Numero da conta " + conta.getNumerodaconta() + " Sacando 50 reais fica em conta: " +conta.getSaldo() ) ;
    }
}
