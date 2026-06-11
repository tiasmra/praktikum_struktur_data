import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph () {
        adjList = new HashMap<>();
    }

    public void addEdge (int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
    }

    public boolean bfs (int start, int target) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);
        System.out.print("Urutan BFS: ");

        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print("a" + node + " ");

            if (node == target) {
                return true;
            }

            for (int neighbor : adjList.get(node)) {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return false;
    }
}

public class BFSCode {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        graph.addEdge(1, 8);

        graph.addEdge(2, 3);
        graph.addEdge(2, 6);

        graph.addEdge(8, 9);

        graph.addEdge(3, 4);

        graph.addEdge(6, 5);
        graph.addEdge(6, 7);

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan node tujuan (0-9): ");

        int n = input.nextInt();

        boolean found = graph.bfs(0, n);

        if (found) {
            System.out.println("\nNode ditemukan.");
        } else {
            System.out.println("\nNode tidak ditemukan.");
        }
        input.close();
    }
}
