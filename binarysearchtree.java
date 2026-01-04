public class BinarySearchTree {
    private Node root;

    BinarySearchTree() { 
    }

    public Node search(int x) {
        return search(this.root, x);
        // return searchIteratively(this.root, x);
    }

    private Node search(Node node, int x) {
        if (node == null || node.val == x) return node;
        if (node.val > x) {
            return search(node.left, x);
        } else {
            return search(node.right, x);
        }
    }

    private Node searchIteratively(Node node, int x) {
        Node res = node;
        while (res != null && res.val != x) {
            if (res.val > x) {
                res = res.left;
            } else {
                res = res.right;
            }
        }
        return res;
    }


    public void insert(int x) {
        this.root = insert(this.root, x);
        // this.root = insertIteratively(this.root, x);
    }

    public Node insert(Node node, int x) {
        if (node == null) return new Node(x);
        if (node.val > x) {
            node.left = insert(node.left, x);
        } else if (node.val < x) {
            node.right = insert(node.right, x);
        }
        return node;
    }

    public Node insertIteratively(Node node, int x) {
        Node newNode = new Node(x);
        if (node == null) return newNode;
        Node res = node;
        while (res != null && res.val != x) {
            if (res.val > x) {
                if (res.left == null) {
                    res.left = newNode;
                } else {
                    res = res.left;
                }
            } else {
                if (res.right == null) {
                    res.right = newNode;
                } else {
                    res = res.right;
                }
            }
        }
        return node;
    }

   
    public void delete(int x) {
        this.root = delete(this.root, x);
    }

    public Node delete(Node node, int x) {
        if (node == null) return null;
        if (node.val == x) {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node succ = node.right;
                while (succ.left != null) {
                    succ = succ.left;
                }
                node.val = succ.val;
                node.right = delete(node.right, node.val);
            }
        } else if (node.val > x) {
            node.left = delete(node.left, x);
        } else {
            node.right = delete(node.right, x);
        }
        return node;
    }

    public Node getRoot() {
        return this.root;
    }

    class Node {
        int val;
        Node left;
        Node right;
        Node(int x) {
            this.val = x;
        }
    }

}