// 부모가 전위 순회 부 - 왼 - 우
// 부모가 중위 왼 - 부 - 우
// 부모가 후위 왼 - 오 - 부

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class 이진트리 {
    Node root;
    // 전위 탐색
    public void DFS(Node root) {
        if(root == null) return;
        else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.printf("%d ", root.data);

        }
    }
    public static void main(String[] args) {
        이진트리 tree = new 이진트리();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}

