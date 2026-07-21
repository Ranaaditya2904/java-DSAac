public class SumTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Converts the tree into a Sum Tree
    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        // Sum of original left subtree
        int leftSum = transform(root.left);

        // Sum of original right subtree
        int rightSum = transform(root.right);

        // Store original value
        int oldValue = root.data;

        // Update current node
        root.data = leftSum + rightSum;

        // Return original subtree sum
        return oldValue + leftSum + rightSum;
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);

        System.out.println("Root of Sum Tree: " + root.data);

        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}