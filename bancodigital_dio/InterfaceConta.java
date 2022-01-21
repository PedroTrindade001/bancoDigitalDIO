
package bancodigital_dio;

public interface InterfaceConta {
    
    void depositar (double valor);
    void depositarSemMensagem(double valor);
        
   
    void transferir (double valor, Conta contaDestino);
        
    
    void sacar (double valor);
    
    void imprimirExtrato();
    
   
}
