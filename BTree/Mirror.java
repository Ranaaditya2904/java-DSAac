public class Mirror {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node InvertedTree(Node root){
        if(root == null){
            return null;
        }

        if(root.left != null || root.right != null){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        Node leftPart = InvertedTree(root.left);
        Node rightPart = InvertedTree(root.right);

        return root;
    }
   
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

      
        root = InvertedTree(root);
      preorder(root);
    }
}
