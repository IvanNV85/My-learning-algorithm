package algorithm.tree;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.insert(10);
        myTree.insert(9);
        myTree.insert(8);
        myTree.insert(11);
        myTree.insert(12);
        myTree.insert(71);

        System.out.println("Root = " + myTree.root.value);
        System.out.println("The Node you need = " + myTree.root.right.right.value);

        System.out.println(myTree.containts(99));
    }
}
