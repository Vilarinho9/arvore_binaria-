package arvore.binaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] valores = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45};
        for (int v : valores) arvore.inserir(v);

        System.out.println("Busca 60: " + arvore.buscar(60));
        System.out.println("Busca 90: " + arvore.buscar(90));

        System.out.print("Pré-ordem: ");
        arvore.preOrdem();

        System.out.print("Em ordem: ");
        arvore.emOrdem();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem();

    }
}
