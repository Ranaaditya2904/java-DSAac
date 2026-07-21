public class Univalued {
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

   

    public static boolean checkIfUnivalued(Node root){
        if(root == null){
            return true;
        }

        if(root.left != null && root.left.data != root.data){
            return false;
        }

        if(root.right !=null && root.right.data != root.data){
            return false;
        }

        
        return checkIfUnivalued(root.left) && checkIfUnivalued(root.right);


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(1);
        root.left = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        if(checkIfUnivalued(root)){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}
