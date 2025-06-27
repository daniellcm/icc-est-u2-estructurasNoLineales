package materia.controllers;

import materia.models.Node;

public class BinaryTree {

    private Node root;
    private int peso = 0;
    
    public BinaryTree(){
        this.root = null;
    }

    public void insert(int value){
        root = insertRecc(root, value);
    }
    private Node insertRecc(Node padre, int value){
        if(padre == null){
            peso++;
            return new Node(value);   
        }
        if(value <= padre.getValue()){
            Node newNode = insertRecc(padre.getleft(), value);
            padre.setleft(newNode);
        }else if(value > padre.getValue()){
            padre.setrigth(insertRecc(padre.getrigth(), value));
        }
        return padre;
    }

    public void imprimirArbol(){
        imprimirArbolRecc(root);
    }
    private void imprimirArbolRecc(Node node){
        if(node != null){
            System.out.print(node.getValue() + ", ");
            imprimirArbolRecc(node.getleft());
            imprimirArbolRecc(node.getrigth());
        }

    }

    public void imprimirInorder() {
        imprimirInorderRecc(root);  
    }

    private void imprimirInorderRecc(Node node) {
        if (node != null) {
            imprimirInorderRecc(node.getleft());
            System.out.print(node.getValue() + ", ");
            imprimirInorderRecc(node.getrigth());
        }
    }

    public void imprimirPostorder() {
        imprimirPostorderRecc(root);
    }

    private void imprimirPostorderRecc(Node node) {
        if (node != null) {
            imprimirPostorderRecc(node.getleft());
            imprimirPostorderRecc(node.getrigth());
            System.out.print(node.getValue() + ", ");
        }
    }

    public boolean findvalue(int value) {
        return findvalueRecc(root, value);
    }

    private boolean findvalueRecc(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.getValue() == value) {
            return true;
        }
        if(value < node.getValue()){
            return findvalueRecc(node.getleft(), value);
        }else{
            return findvalueRecc(node.getrigth(), value);
        }
    }

    public int getHeightRecc(){
        return getHeightRecc(root);
    }

    public int getHeightRecc(Node node){
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeightRecc(node.getleft());
        int rightHeight = getHeightRecc(node.getrigth());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void InorderConAltura(){
        InorderConAlturaRecc(root);
        System.out.println();
    }

    private void InorderConAlturaRecc(Node node) {
        if (node != null) {
            InorderConAlturaRecc(node.getleft());
            int altura = getHeightRecc(node);
            System.out.print(node.getValue() + "(h=" + altura + "), ");
            InorderConAlturaRecc(node.getrigth());
        }
    }

    public void InorderConBalance() {
        InorderConBalanceRecc(root);
        System.out.println();
    }

    private void InorderConBalanceRecc(Node node) {
        if (node != null) {
            InorderConBalanceRecc(node.getleft());
            int bf = getHeightRecc(node.getleft()) - getHeightRecc(node.getrigth());
            System.out.print(node.getValue() + "(bf=" + bf + "), ");
            InorderConBalanceRecc(node.getrigth());
        }
    }

    public int getPeso() {
        return peso;
    }

    public boolean Equilibrado() {
        return EquilibradoRecc(root);
    }

    private boolean EquilibradoRecc(Node node) {
        if (node == null) return true;
        int leftHeight = getHeightRecc(node.getleft());
        int rightHeight = getHeightRecc(node.getrigth());
        if (Math.abs(leftHeight - rightHeight) > 1) return false;
        return EquilibradoRecc(node.getleft()) && EquilibradoRecc(node.getrigth());
    }

    public void NodosDesbalanceados() {
        System.out.print("Nodos desbalanceados: ");
        NodosDesbalanceadosRecc(root);
        System.out.println();
    }

    private void NodosDesbalanceadosRecc(Node node) {
        if (node != null) {
            NodosDesbalanceadosRecc(node.getleft());
            int fe = getHeightRecc(node.getleft()) - getHeightRecc(node.getrigth());
            if (Math.abs(fe) > 1) {
                System.out.print(node.getValue() + "(fE=" + fe + "), ");
            }
            NodosDesbalanceadosRecc(node.getrigth());
        }
    }
}
    
