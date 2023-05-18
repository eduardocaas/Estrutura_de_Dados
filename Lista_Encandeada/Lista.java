public class Lista {

    public No inicio = null;
    public int tamanho = 0;

    public void addNoFim(int valor){
        No nodo = new No(valor);
        if (this.inicio == null) {
            this.inicio = nodo;
        }
        else {
            No aux = this.inicio;
            while (aux.proximo != null){
                aux = aux.proximo;
            }
            aux.proximo = nodo;
        }
        this.tamanho++;
        this.printar();
    }

    public void removerDoFim(){
        if(this.inicio == null){
            this.printar();
        }
        else if(this.inicio.proximo == null) {
            this.inicio = null;
            this.tamanho = 0;
        }
        else {
            No ant = this.inicio;
            No aux = this.inicio.proximo;
            while (aux.proximo != null){
                ant = aux;
                aux = aux.proximo;
            }
            ant.proximo = null;
            this.tamanho--;
            this.printar();
        }
    }

    public void removerValor(int valor){
        if(this.inicio == null){
            this.printar();
        }
        else if(this.inicio.valor == valor){
            if(this.inicio.proximo == null){
                this.inicio = null;
                this.tamanho = 0;
            } else {
                No prox = this.inicio.proximo;
                this.inicio = null;
                this.inicio = prox;
                this.tamanho--;
            }
        }
        else {
            No ant = this.inicio;
            No aux = this.inicio.proximo;
            No prox = null;
            while(aux.proximo != null){
                if(aux.valor == valor){
                    prox = ant.proximo.proximo;
                    ant.proximo = null;
                    this.tamanho--;
                    break;
                }
                ant = aux;
                aux = aux.proximo;
            }
            ant.proximo = prox;
        }
        this.printar();
    }

    public void printar(){
        System.out.println("----------");
        if(this.inicio == null){
            System.out.println("Lista vazia");
        }
        else {
            System.out.println("Tamanho: " + this.tamanho);
            No aux = this.inicio;
            while (aux != null){
                System.out.println(aux.valor);
                aux = aux.proximo;
            }
        }
    }
}
