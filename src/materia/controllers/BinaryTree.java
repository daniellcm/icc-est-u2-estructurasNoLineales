package materia.controllers;
import materia.models.Node;

public class BinaryTree {
    
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) { //17
                 //N(50), 17
        root = insertRec(root, value);
    }

    private Node insertRec(Node padre, int value){
                //N(50), 17 
        if(padre == null) {
            return new Node(value);
        }   

        if (value <= padre.getValue()) {
            //Me voy a la izquierda
            Node newNode = insertRec(padre.getLeft(), value);
            padre.setLeft(newNode);
        } else if (value > padre.getValue()){
            //Me voy a la derecha
            padre.setRight(insertRec(padre.getRight(), value));
        }

        return padre;
    }

    public void imprimirArbol() {
        imprimirArbolRec(root);
    }

    private void imprimirArbolRec(Node node) {
        if (node != null) {
            
            System.out.print(node.getValue() + ",");
            imprimirArbolRec(node.getLeft());
            imprimirArbolRec(node.getRight());
        }
    }

    public void printPosOrden() {
        printPosOrdenRec(root);
    }

    private void printPosOrdenRec(Node node) {
        if (node != null) {
            printPosOrdenRec(node.getLeft());
            printPosOrdenRec(node.getRight());
            System.out.print(node.getValue() + ",");
        }
    }

    public void printInOrden() {
        printInOrdenRec(root);
    }

    private void printInOrdenRec(Node node) {
        if (node != null) {
            printInOrdenRec(node.getLeft());
            System.out.print(node.getValue() + ",");
            printInOrdenRec(node.getRight());
        }
    }
}
