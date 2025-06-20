package materia.controllers;

import materia.models.Node;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) { // 17
        // N(50), 17
        root = insertRec(root, value);
    }

    private Node insertRec(Node padre, int value) {
        // N(50), 17
        if (padre == null) {
            return new Node(value);
        }

        if (value <= padre.getValue()) {
            // Me voy a la izquierda
            Node newNode = insertRec(padre.getLeft(), value);
            padre.setLeft(newNode);
        } else if (value > padre.getValue()) {
            // Me voy a la derecha
            padre.setRight(insertRec(padre.getRight(), value));
        }

        padre.setHeight(1 + Math.max(getHeight(padre.getLeft()), getHeight(padre.getRight())));
        return padre;
    }

    public int getAltura() {
        return getHeight(root);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.getLeft()) - getHeight(node.getRight());
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

    public void printInOrdenConAltura() {
        printInOrdenConAlturaRec(root);
    }

    private void printInOrdenConAlturaRec(Node node) {
        if (node != null) {
            printInOrdenConAlturaRec(node.getLeft());
            System.out.print(node.getValue() + "(h=" + node.getHeight() + "), ");
            printInOrdenConAlturaRec(node.getRight());
        }
    }

    public void printInOrdenConBalance() {
        printInOrdenConBalanceRec(root);
    }

    private void printInOrdenConBalanceRec(Node node) {
        if (node != null) {
            printInOrdenConBalanceRec(node.getLeft());
            System.out.print(node.getValue() + "(bf=" + getBalance(node) + "), ");
            printInOrdenConBalanceRec(node.getRight());
        }
    }

    public boolean findeValue(int value) {
        return findeValueRec(root, value);
    }

    private boolean findeValueRec(Node node, int value) {
        if (node == null) {
        return false;
        }
        if (node.getValue() == value) {
            return true;
        }

        if (findeValueRec(node.getLeft(), value)) {
            return true;
        }
        if (findeValueRec(node.getRight(), value)) {
            return true;
        }
        return false;
    }

    public boolean estaBalanceado() {
        return estaBalanceadoRec(root);
    }

    private boolean estaBalanceadoRec(Node node) {
        if (node == null) return true;
        int balance = getBalance(node);
        return Math.abs(balance) <= 1 && estaBalanceadoRec(node.getLeft()) && estaBalanceadoRec(node.getRight());
    }

    public void printNodosDesequilibrados() {
        printNodosDesequilibradosRec(root);
    }

    private void printNodosDesequilibradosRec(Node node) {
        if (node != null) {
            printNodosDesequilibradosRec(node.getLeft());
            int bf = getBalance(node);
            if (Math.abs(bf) > 1) {
                System.out.println("Nodo desequilibrado: " + node.getValue() + " (fE = " + bf + ")");
            }
            printNodosDesequilibradosRec(node.getRight());
        }
    }
}
    
