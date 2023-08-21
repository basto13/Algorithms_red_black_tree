import tree.RedBlackTree;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insertNode(5);
        tree.insertNode(1);
        tree.insertNode(3);
        tree.insertNode(10);
        tree.insertNode(20);
        tree.insertNode(15);
        tree.insertNode(7);
        tree.insertNode(13);
        tree.insertNode(2);
        tree.insertNode(22);

        System.out.println(tree);

        if (tree.searchNode(5) != null) {
            System.out.println("5 in tree");
        }

        if (tree.searchNode(123) == null) {
            System.out.println("123 not in tree");
        }
    }
}