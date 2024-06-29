import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<IConta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    public IConta buscarConta(int numero) {
        for (IConta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null; // Se não encontrar a conta
    }

    public void listarContas() {
        for (IConta conta : contas) {
            System.out.println(conta);
        }
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor) {
        IConta contaOrigem = buscarConta(numeroOrigem);
        IConta contaDestino = buscarConta(numeroDestino);
        
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferencia de:" + valor + " Para:" + contaDestino.getCliente() + " Realizado com sucesso.");
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }
}
