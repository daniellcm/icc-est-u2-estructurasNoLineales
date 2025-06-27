package materia.controllers;
import materia.models.Node;
public class AVLTree {
 private Node root;

 public AVLTree() {
    this.root = null;
 }
 
 public void insert(int value) {
    root = insertRect(root, value);
 }

 private Node insertRect(Node node, int value) {
    if(node == null){
        Node newNode = new Node(value);
        newNode.setHeight(1);
        System.out.println("Nodo insertado -> " + value + " con balance " + getBalance(newNode));
        return newNode;   
    }
    if(value <= node.getValue()){
        Node newNode = insertRect(node.getleft(), value);
        node.setleft(newNode);
    } else if(value > node.getValue()){
        node.setrigth(insertRect(node.getrigth(), value));
    } else {
        return node;
    }

    System.out.println("Nodo actial ->" + node.getValue());
    int altura = 1 + Math.max(height(node.getleft()), height(node.getrigth()));
    node.setHeight(altura);
    System.out.println("\tAltura -> " + node.getHeight());
    // obtener el balance
    int balance = getBalance(node);
    System.out.println("\tBalance -> " + balance);
    //CASO IZQUIERA - IZQUIERDA
    if(balance > 1 && value < node.getleft().getValue()) {
        System.out.println("Rotacion simple derecha ");
        return rightRotate(node);
    }
    // CASO DERECHA - DERECHA
    if(balance < -1 && value > node.getrigth().getValue()) {
        System.out.println("Rotacion simple izquierda ");
        return leftRotate(node);
    }
    //CASO IZQUIERDA - DERECHA
    if (balance > 1 && value > node.getleft().getValue()) {
        System.out.println("Cambio ");
        node.setleft(leftRotate(node.getleft()));
        System.out.println("Rotacion izquierda derecha ");
        return rightRotate(node);
    }
    //CASO DERECHA - IZQUIERDA
    if(balance < -1 && value < node.getrigth().getValue()) {
        System.out.println("Cambio ");
        node.setrigth(rightRotate(node.getrigth()));
        System.out.println("Rotacion simple derecha ");
        return leftRotate(node);
    }
    return node;
}

 //Q(2^n) => O(1)
 private int height(Node node) {
    if(node == null) {
        return 0;
    }
    return node.getHeight();
 }

 private int getBalance(Node node) {
    if(node == null) {
        return 0;
    }
    return height(node.getleft()) - height(node.getrigth());
 }

 public Node leftRotate(Node x) {
    Node y = x.getrigth();
    Node temp = y.getleft();

    //Imprimir informacion antes de la rotacion
    System.out.println("Notacion IZQ en nodo: " + x.getValue()
            + ", con balance =  " + getBalance(x));
    //Realizar la rotacion
    y.setleft(x);
    x.setrigth(temp);
    // Actualizar las alturas de X y Y
    x.setHeight(Math.max(height(x.getleft()), height(x.getrigth())) + 1);
    y.setHeight(Math.max(height(y.getleft()), height(y.getrigth())) + 1);
    System.out.println("Nueva raiz despues de la rotacion: " + y.getValue());
    return y;
 }
 
 private Node rightRotate(Node y) {
    Node x = y.getleft();
    Node temp = x.getrigth();

    System.out.println("Notacion DER en nodo: " + y.getValue()
            + ", con balance =  " + getBalance(y));

    x.setrigth(y);
    y.setleft(temp);

    y.setHeight(Math.max(height(y.getleft()), height(y.getrigth())) + 1);
    x.setHeight(Math.max(height(x.getleft()), height(x.getrigth())) + 1);
    System.out.println("Nueva raiz despues de la rotacion: " + x.getValue());
    return x;
 }
}
