public interface IConta {
    int getNumero();
    double getSaldo();
    Cliente getCliente();
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, IConta contaDestino);
}
