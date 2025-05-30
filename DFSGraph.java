import java.util.*;

public class DFSGraph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public DFSGraph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) adjList[i] = new LinkedList<>();
    }

    public void addEdge(int u, int v) { adjList[u].add(v); }

    public void dfsRecursive(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int n : adjList[node]) {
            if (!visited[n]) dfsRecursive(n, visited);
        }
    }

    public void startDFS(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS: ");
        dfsRecursive(start, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(6);
        g.addEdge(0,1); g.addEdge(0,2); g.addEdge(1,3);
        g.addEdge(1,4); g.addEdge(2,5);
        g.startDFS(0);
    }
}