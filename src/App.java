import materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree ab = new BinaryTree();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);
        ab.imprimirArbol();
        System.out.println();
        System.out.println("PosOrden: ");
        ab.printPosOrden();
        System.out.println();
        System.out.println("InOrden: ");
        ab.printInOrden();
        System.out.println();

        if (ab.findeValue(23)) {
            System.out.println("Encontro el valor 23 en el árbol.");
        } else {
            System.out.println("No encontró el valor 23 en el árbol.");
        }
        if (ab.findeValue(77)) {
            System.out.println("Encontro el valor 77 en el árbol.");
        } else {
            System.out.println("No encontró el valor 77 en el árbol.");
        }

        ab.insert(15);
        System.out.println("Altura es = " + ab.getAltura() + "\n");

        System.out.println("Arbol InOrder");
        ab.printInOrden();
        System.out.println();

        System.out.println("Arbol InOrder con alturas");
        ab.printInOrdenConAltura();
        System.out.println();

        System.out.println("Arbol InOrder con factor de equilibrio");
        ab.printInOrdenConBalance();
        System.out.println();

        System.out.println("Arbol esta equilibrado = " + ab.estaBalanceado());

        System.out.println("Existe el nodo 15= " + ab.findeValue(15));
        System.out.println("Agregamos valor = 15");
        ab.insert(15);
        System.out.println("Arbol esta equilibrado = " + ab.estaBalanceado());

        System.out.println("\nArbol InOrder con factor de equilibrio");
        ab.printInOrdenConBalance();

        System.out.println("\nNodos desequilibrados:");
        ab.printNodosDesequilibrados();
    }
}
