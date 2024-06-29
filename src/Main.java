public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Aline Santos", "111.222.333-44");
        Cliente cliente2 = new Cliente("Dhiego Oliveira", "555.666.777-88");

        IConta contaCorrente = new ContaCorrente(1, cliente1, 500.0);
        IConta contaPoupanca = new ContaPoupanca(2, cliente2, 0.05);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(10000);
        contaPoupanca.depositar(20000);

        contaCorrente.sacar(300);
        ((ContaPoupanca) contaPoupanca).renderJuros(); // Necessário fazer o cast para acessar método específico

        banco.transferir(1, 2, 200);

        banco.listarContas();
    }
}
