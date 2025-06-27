import materia.controllers.AVLTree;
import materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        //BinaryTree tree = new BinaryTree();
        //System.out.println();
        //System.out.println("Nombre : Daniel Cajas");
        //System.out.println();
        //tree.insert(50);
        //tree.insert(17);
        //tree.insert(76);
        //tree.insert(9);
        //tree.insert(23);
        //tree.insert(54);
        //tree.insert(14);
        //tree.insert(19);
        //// calcula el peso del arbol
        //System.out.println("Peso del arbol = " + tree.getPeso());
        //System.out.println();
        //// calcula la altura del arbol
        //System.out.println("Altura del arbol = " + tree.getHeightRecc());
        //System.out.println();
        ////calula con diferentes met
        ////System.out.println("PreOrder :");
        ////tree.imprimirArbol();
        ////System.out.println();
        //System.out.println("InOrder :");
        //tree.imprimirInorder();
        //System.out.println();
        ////System.out.println("PostOrder :");
        ////tree.imprimirPostorder();
        ////System.out.println();
        //
        //// implementa un método que busque un valor en el árbol
        ///*System.out.println();
        //if (tree.findvalue(23)) {
        //    System.out.println("El valor 23 se encuentra en el arbol.");
        //} else {
        //    System.out.println("El valor 23 no se encuentra en el arbol.");
        //}
        //if (tree.findvalue(77)) {
        //    System.out.println("El valor 77 se encuentra en el arbol.");
        //} else {
        //    System.out.println("El valor 77 no se encuentra en el arbol.");
        //}*/
        ////calcula Inorder con altura
        //System.out.println();
        //System.out.println("Arbol InOrder con altura :");
        //tree.InorderConAltura();
        //System.out.println();
        ////calcula el balance de el arbol
        //System.out.println("Arbol InOrder con factor de equilibrio:");
        //tree.InorderConBalance();
        //System.out.println();
        ////verifica si esta o no equilibrado
        //System.out.println("El Arbol esta equilibrado = " + tree.Equilibrado());
        //System.out.println();
        ////verifica si un nodo existe
        //boolean e15 = tree.findvalue(15);
        //System.out.println("Existe el nodo 15 = " + e15);
        //System.out.println();
        ////agrega el nodo si no existe
        //if (!e15) {
        //    tree.insert(15);
        //    System.out.println("Agregamos valor = " + 15 );
        //    System.out.println();
        //}
        ////verifica si el arbol actual esta o no equilibrado
        //System.out.println("El Arbol esta equilibrado ahora = " + tree.Equilibrado());
        //System.out.println();
        ////calcula el balance de el arbol actualizado
        //System.out.println("Arbol InOrder actualizado con factor de equilibrio:");
        //tree.InorderConBalance();
        //System.out.println();
        //// muestra los nodos desequilibrados
        //tree.NodosDesbalanceados();
        //System.out.println();

        AVLTree avlTree = new AVLTree();
        avlTree.insert(5);
        avlTree.insert(20);
        avlTree.insert(15);

    }
}
