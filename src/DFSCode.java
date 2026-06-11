import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph () {
        adjList = new HashMap<>();
    }

    // Menambahkan hubungan antar node
    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
    }

    // Memulai proses DFS
    public boolean dfs(int start, int target) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("Urutan DFS: ");
        return dfsRecursive(start, target, visited);
    }

    // Fungsi DFS Rekursif
    public boolean dfsRecursive(int node, int target, Set<Integer> visited) {
        System.out.print("a" + node + " ");
        visited.add(node);

        // Apabila target ditemukan
        if (node == target) {
            return true;
        }

        // Menelusuri semua tetangga node
        for (int neighbor : adjList.get(node)) {
            if (!visited.contains(neighbor)) {
                if (dfsRecursive(neighbor, target, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class DFSCode {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0,1);
        graph.addEdge(0,2);

        graph.addEdge(1,3);

        graph.addEdge(2,4);
        graph.addEdge(2,5);

        graph.addEdge(3,6);
        graph.addEdge(3,7);

        graph.addEdge(4,8);

        graph.addEdge(5,9);

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan node tujuan (0-9): ");
        int n = input.nextInt();

        boolean found = graph.dfs(0, n);

        if (found) {
            System.out.println("\nNode ditemukan.");
        } else {
            System.out.println("\nNode tidak ditemukan.");
        }
    }
}
