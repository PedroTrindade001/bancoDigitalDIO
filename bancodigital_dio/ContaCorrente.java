
package bancodigital_dio;


public class ContaCorrente extends Conta {

    public ContaCorrente (Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Seu Extrato Conta Corrente ===");
        super.imprimirExtrato(); 
    }
}
