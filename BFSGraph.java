import java.util.*;

public class BFSGraph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public BFSGraph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) adjList[i] = new LinkedList<>();
    }

    public void addEdge(int u, int v) { adjList[u].add(v); }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int n : adjList[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFSGraph g = new BFSGraph(6);
        g.addEdge(0,1); g.addEdge(0,2); g.addEdge(1,3);
        g.addEdge(1,4); g.addEdge(2,5);
        g.bfs(0);
    }
}