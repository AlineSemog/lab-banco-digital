public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo() + limite) {
            super.sacar(valor); // Usando método depositar para decrementar
        } else {
            System.out.println("Saldo insuficiente incluindo limite.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", " + super.toString() +
                '}';
    }
}
