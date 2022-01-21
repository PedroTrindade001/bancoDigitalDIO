
package bancodigital_dio;



public class Cliente {
    
    public String nome;
    int idade;
    long CPF;

    public Cliente(String nome, int idade, long CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Cliente:{" + "Nome= " + nome + ", Idade= " + idade + ", CPF= " + CPF + '}';
    }

  
    
    
}
