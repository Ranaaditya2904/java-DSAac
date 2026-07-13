//package BTree;

public class FindDiameter {
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

    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        
        int lh = Height(root.left);
        int rh = Height(root.right);

        return Math.max(lh,rh)+1;
    } 

    public static int count(Node root){
        int count = 0;
        if(root == null){
            return count=0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return lc+rc+1;
    }

    public static int diameter2(Node root){ //o(n^2)
        if(root == null){
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHeight = Height(root.left);

        int rightDiam = diameter2(root.right);
        int rightHeight = Height(root.right);

        int selfDiam = leftHeight + rightHeight + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    static class Info{
        int diam;
        int height;

        public Info(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.height+rightInfo.height+1);
        int height = Math.max(leftInfo.height, rightInfo.height)+1;

        return new Info(diam, height);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.right = new Node(2);
        root.left = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root).height);
    }
}
