
package bancodigital_dio;

public class main{
    
    public static void main(String[] args) {
  
        Cliente cliente1 = new Cliente("Pedro", 20, 12345678901L);
        Cliente cliente2 = new Cliente("Gabriela", 19, 12345678902L);
        
        Mensagem.boasVindas();
        
        MetodosClientes metodo=new MetodosClientes();
        
        metodo.inserir(cliente1);
        metodo.inserir(cliente2);
        
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupança(cliente2);
        
        contaCorrente.depositar(500);
        contaCorrente.transferir(200, contaPoupanca);
        contaPoupanca.sacar(50);
       
        
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        
        Mensagem.listaClientes();
        metodo.exibir();
        
        metodo.remover(cliente2);
        
        Mensagem.listaClientes();
        metodo.exibir();
}
}
