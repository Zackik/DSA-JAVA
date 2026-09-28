public class BinarySearchTree {
    Node1 root;
    public void insert(Node1 node){
        root = insertHelper(root, node);
    }
    private Node1 insertHelper(Node1 root, Node1 node){
        int data = node.data;
        if(root == null){
            root = node;
            return root;
        }else if(data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node1 root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root,data);
    }
    private boolean searchHelper(Node1 root, int data ){
        if(root ==null){
            return false;
        }
        else if(root.data == data){
            return true;
        }
        else if(root.data > data){
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }

    }
    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " could not be found");
        }
    }
    public Node1 removeHelper(Node1 root, int data){
        if(root == null){
            return root;
        }else if(data < root.data){
            root.left = removeHelper(root.left,data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.left, data);
        }
        else{
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right != null){
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }

        return root;
    }
    private int successor(Node1 root){
        //find least value below right child of this root node
        root = root.right;
        while (root.left != null){
            root = root.left;
        }

        return root.data;
    }
    private int predecessor(Node1 root){
        root = root.right;
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }

}
