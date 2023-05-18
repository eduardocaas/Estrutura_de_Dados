public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.printar();

        lista.addNoFim(6);
        lista.addNoFim(61);
        lista.addNoFim(32);
        lista.addNoFim(14);
        //lista.removerDoFim();
        lista.removerValor(32);
        //lista.removerValor(14); todo - remover último valor
    }
}