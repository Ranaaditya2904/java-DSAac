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
    
    public static boolean isIdentical(Node node, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
       
    public static boolean isSubtree(Node root, Node subRoot){

        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    

    public static void main(String[] args){
        Node root = new Node(1);
        root.right = new Node(2);
        root.left = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        //System.out.println(diameter(root).height);

        //System.out.println(isSubtree(root, subRoot));
    }
}
