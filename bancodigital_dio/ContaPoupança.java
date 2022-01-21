
package bancodigital_dio;


public class ContaPoupança extends Conta {
    
    public ContaPoupança (Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Seu Extrato Conta Poupança ===");
        super.imprimirExtrato(); 
    }
    
}
