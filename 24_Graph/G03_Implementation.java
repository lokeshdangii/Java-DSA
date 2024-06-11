import java.util.ArrayList;

// Class for weighted graphs
public class G03_Implementation {

    // Custom class to store edges with weights
    static class Edge {
        int vertex;
        int weight;

        Edge(int v, int w) {
            vertex = v;
            weight = w;
        }
    }

    // Method to add an edge with weight
    static void addEdge(ArrayList<ArrayList<Edge>> adj, int u, int v, int weight, boolean direction) {
        if(direction){
            adj.get(u).add(new Edge(v, weight));
        }else{
            adj.get(u).add(new Edge(v, weight));
            adj.get(v).add(new Edge(u, weight));
        }
    }

    // Method to print the adjacency list
    static void printAdjList(ArrayList<ArrayList<Edge>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " : { ");
            for (Edge edge : adj.get(i)) {
                System.out.print("(" + edge.vertex + " , " + edge.weight + "), ");
            }
            System.out.println("} ");
        }
    }

    public static void main(String[] args) {
        int V = 7;  // Number of vertices
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>(V);

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges with weights
        addEdge(adj, 1, 6, 14, false);
        addEdge(adj, 1, 3, 9, false);
        addEdge(adj, 1, 2, 7, false);
        addEdge(adj, 2, 3, 10, false);
        addEdge(adj, 2, 4, 15, false);
        addEdge(adj, 3, 4, 11, false);
        addEdge(adj, 6, 3, 2, false);
        addEdge(adj, 6, 5, 9, false);
        addEdge(adj, 5, 4, 6, false);

        // Printing the adjacency list
        printAdjList(adj);
    }
}
