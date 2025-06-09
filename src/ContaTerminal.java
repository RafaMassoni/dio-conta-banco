import java.math.BigDecimal;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;


    public ContaTerminal(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void printContaCriadaComSucesso() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

    }

}
