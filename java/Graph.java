import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    // =====================================================
    // 1. DATA STRUCTURE
    // =====================================================

    // Lưu tất cả các Node
    ArrayList<Node> nodes;
    int[][] matrix;

    // Adjacency List
    // Mỗi Node có một LinkedList chứa các Node hàng xóm
    ArrayList<LinkedList<Node>> alist;


    // =====================================================
    // 2. CONSTRUCTOR
    // =====================================================

    Graph() {

        // Tạo danh sách Node
        nodes = new ArrayList<>();

        // Tạo danh sách kề
        alist = new ArrayList<>();
    }


    // =====================================================
    // 3. ADD NODE
    // =====================================================

    public void addNode(Node node) {

        // Lưu Node vào danh sách nodes
        nodes.add(node);

        // Tạo một danh sách hàng xóm cho Node này
        alist.add(new LinkedList<>());
    }


    // =====================================================
    // 4. ADD EDGE
    // =====================================================

    public void addEdge(int src, int dst) {

        // Lấy Node đích
        Node dstNode = nodes.get(dst);

        // Thêm Node đích vào danh sách hàng xóm
        // của Node nguồn
        alist.get(src).add(dstNode);
    }


    // =====================================================
    // 5. CHECK EDGE
    // =====================================================

    public boolean checkEdge(int src, int dst) {

        // Lấy danh sách hàng xóm của src
        LinkedList<Node> currentList = alist.get(src);

        // Lấy Node cần kiểm tra
        Node dstNode = nodes.get(dst);

        // Duyệt qua các hàng xóm
        for (Node neighbor : currentList) {

            if (neighbor == dstNode) {
                return true;
            }
        }

        return false;
    }


    // =====================================================
    // 6. PRINT GRAPH
    // =====================================================

    public void print() {

        for (int i = 0; i < alist.size(); i++) {

            System.out.print(nodes.get(i).data + " -> ");

            for (Node neighbor : alist.get(i)) {

                System.out.print(neighbor.data + " ");
            }

            System.out.println();
        }
    }


    // =====================================================
    // 7. DEPTH FIRST SEARCH
    // =====================================================

    public void depthFirstSearch(int src) {

        // visited[i] = true
        // nghĩa là Node i đã được thăm
        boolean[] visited = new boolean[nodes.size()];

        // Bắt đầu DFS từ src
        dfsHelper(src, visited);
    }


    // =====================================================
    // 8. DFS HELPER
    // =====================================================

    private void dfsHelper(int src, boolean[] visited) {

        // -------------------------------------------------
        // STEP 1: Nếu Node đã được thăm
        // -------------------------------------------------

        if (visited[src]) {
            return;
        }


        // -------------------------------------------------
        // STEP 2: Đánh dấu Node đã được thăm
        // -------------------------------------------------

        visited[src] = true;


        // -------------------------------------------------
        // STEP 3: In Node hiện tại
        // -------------------------------------------------

        System.out.println(
                nodes.get(src).data + " = visited"
        );


        // -------------------------------------------------
        // STEP 4: Lấy danh sách hàng xóm
        // -------------------------------------------------

        LinkedList<Node> neighbors = alist.get(src);


        // -------------------------------------------------
        // STEP 5: Đi đến từng hàng xóm
        // -------------------------------------------------

        for (Node neighbor : neighbors) {

            // Tìm index của Node hàng xóm
            int neighborIndex = nodes.indexOf(neighbor);

            // DFS tiếp tục từ Node hàng xóm
            dfsHelper(neighborIndex, visited);
        }
    }
    public void breadthFirstSearch(int src) {

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[nodes.size()];

        // Bắt đầu từ src
        queue.offer(src);
        visited[src] = true;

        while (!queue.isEmpty()) {

            // Lấy node đầu queue
            int current = queue.poll();

            System.out.println(
                    nodes.get(current).data + " = visited"
            );

            // Lấy danh sách hàng xóm
            LinkedList<Node> neighbors = alist.get(current);

            // Duyệt từng hàng xóm
            for (Node neighbor : neighbors) {

                int neighborIndex = nodes.indexOf(neighbor);

                // Nếu chưa thăm
                if (!visited[neighborIndex]) {

                    visited[neighborIndex] = true;

                    queue.offer(neighborIndex);
                }
            }
        }
    }
}