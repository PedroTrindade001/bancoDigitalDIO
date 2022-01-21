package bancodigital_dio;

public class MetodosClientes {
    
    private Elemento inicio = null, atual, aux;
    private int quantidadeElementos = 0;

    public void inserir(Object info) {
        if (inicio == null) {
            Elemento novoElemento = new Elemento(null, null, info);
            inicio = novoElemento;
            aux = inicio;
            quantidadeElementos++;
        } else {
            Elemento novoElemento = new Elemento(aux, null, info);
            atual = novoElemento;
            aux.setProx(atual);
            aux = atual;
            quantidadeElementos++;
        }
    }

    public void exibir() {
        Elemento exibe = atual;
        while (exibe != null) {
            System.out.println(exibe.getInfo());
            exibe = exibe.getAnt();
        }
    }

    public Elemento pesquisar(Object info) {
        Elemento pesq = inicio;
        while (pesq != null) {
            if (pesq.getInfo() == info) {
                return pesq;
            }
            pesq = pesq.getProx();
        }
        return null;
    }

    public boolean remover(Object info) {
        Elemento rem = pesquisar(info);
        if (rem != null) {
            //Remoção do primeiro elemento
            if (rem == inicio) {
                inicio = rem.getProx();
                rem.setProx(null);
                inicio.setAnt(null);
                System.out.println("=== Cliente Removido Com Sucesso ===");
            } else if (rem == atual) {//Remoção do último elemento
                atual = rem.getAnt();
                atual.setProx(null);
                rem.setAnt(null);
                System.out.println("=== Cliente Removido Com Sucesso ===");
            } else {//Remoção de um elemento qualquer
                rem.getAnt().setProx(rem.getProx());
                rem.getProx().setAnt(rem.getAnt());
                System.out.println("=== Cliente Removido Com Sucesso ===");
            }
            quantidadeElementos--;
            return true;
        }
        return false;
    } 
    
}
