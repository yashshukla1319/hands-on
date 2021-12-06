class Node{
    int key;
    Node left,right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class inorder {
    Node root;

    inorder() { root = null; }
    public void ordered(Node node){
        if (node == null){
            return;
        }
        ordered(node.left);
        System.out.println(node.key);
        ordered(node.right);
    }
    void printInorder() { ordered(root); }
    public static void main(String[] args){
        inorder tree = new inorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Inordered Tree: ");
        tree.printInorder();
    }
}
