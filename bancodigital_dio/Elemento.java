
package bancodigital_dio;


public class Elemento {
    private Elemento ant, prox;
    private Object info;

    public Elemento() {
    }

    public Elemento(Elemento ant, Elemento prox, Object info) {
        this.ant = ant;
        this.prox = prox;
        this.info = info;
    }

    public Elemento getAnt() {
        return ant;
    }

    public void setAnt(Elemento ant) {
        this.ant = ant;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Elemento{" + info + '}';
    } 
}
