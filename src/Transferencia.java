import java.util.HashMap;
import java.util.Map;

public class Transferencia {

    private Map<String, Conta> pixMap = new HashMap<>();

    public void transferirPorConta(Conta origem, double valor, Conta destino) {
        origem.transferir(valor, destino);
    }

    public void transferirPorPix(Conta origem, double valor, String chavePix) {
        Conta contaDestino = pixMap.get(chavePix);
        if (contaDestino != null) {
            origem.transferir(valor, contaDestino);
        } else {
            System.out.println("Chave Pix não encontrada.");
        }
    }

    public void cadastrarPix(String chavePix, Conta conta) {
        pixMap.put(chavePix, conta);
    }
}