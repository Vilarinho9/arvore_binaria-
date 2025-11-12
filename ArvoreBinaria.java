package arvore.binaria;

public class ArvoreBinaria {
    private Node raiz;

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new Node(valor);
        } else {
            inserirRec(raiz, valor);
        }
    }

    private void inserirRec(Node atual, int valor) {
        if (valor < atual.valor) {
            if (atual.esquerda == null)
                atual.esquerda = new Node(valor);
            else
                inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            if (atual.direita == null)
                atual.direita = new Node(valor);
            else
                inserirRec(atual.direita, valor);
        }
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node atual, int valor) {
        if (atual == null)
            return false;
        if (atual.valor == valor)
            return true;
        return buscarRec(valor < atual.valor ? atual.esquerda : atual.direita, valor);
    }

    public void preOrdem() {
        imprimirPreOrdem(raiz);
        System.out.println();
    }

    private void imprimirPreOrdem(Node no) {
        if (no == null) return;
        System.out.print(no.valor + " ");
        imprimirPreOrdem(no.esquerda);
        imprimirPreOrdem(no.direita);
    }

    public void emOrdem() {
        imprimirEmOrdem(raiz);
        System.out.println();
    }

    private void imprimirEmOrdem(Node no) {
        if (no == null) return;
        imprimirEmOrdem(no.esquerda);
        System.out.print(no.valor + " ");
        imprimirEmOrdem(no.direita);
    }

    public void posOrdem() {
        imprimirPosOrdem(raiz);
        System.out.println();
    }

    private void imprimirPosOrdem(Node no) {
        if (no == null) return;
        imprimirPosOrdem(no.esquerda);
        imprimirPosOrdem(no.direita);
        System.out.print(no.valor + " ");
    }
}

