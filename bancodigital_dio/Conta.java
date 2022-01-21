
package bancodigital_dio;

public abstract class Conta implements InterfaceConta {
    
    private static final int numeroAgencia = 1;
    private static int numeroConta = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo; 
    boolean mensagem = true;
    private final Cliente cliente;
    
    public Conta(Cliente cliente){
        this.agencia= numeroAgencia;
        this.numero= numeroConta++;
        this.cliente = cliente;
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.mensagem = false;
        this.sacar(valor);
        contaDestino.depositarSemMensagem(valor);
        System.out.println("Você Transferiu R$"+ valor);
        mensagem = true;
    }
    
     @Override
    public void depositar(double valor) {
        saldo += valor;  
        System.out.println("Você Depositou R$"+ valor); // não consegui corrigir o bug onde, quando o depositar for chamado pelo método "transferir" ele deveria pular o System.out.println  
    }
    
    @Override
    public void depositarSemMensagem(double valor) {
        saldo += valor;  
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        if (mensagem == true){
        System.out.println("Você Sacou R$"+ valor);
        }
        
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("Titular:" + this.cliente.getNome());
        System.out.println("Agência:" + this.agencia);
        System.out.println("Numero da Conta:" + this.numero);
        System.out.println("Seu Saldo R$:" + this.saldo);
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

   
    
    
}
