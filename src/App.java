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
    }
}
