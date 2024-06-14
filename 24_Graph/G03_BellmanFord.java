import java.util.*;

public class G03_BellmanFord {

    // Custom class to store edges with weights
    static class Edge implements Comparable<Edge> {
        char vertex;
        int weight;

        Edge(char v, int w) {
            vertex = v;
            weight = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.weight - e2.weight;
        }
    }

    // Method to add an edge with weight
    static void addEdge(ArrayList<ArrayList<Edge>> adj, char u, char v, int weight, boolean direction) {
        int uIdx = u - 'A'; // Convert char to index
        int vIdx = v - 'A'; // Convert char to index
        if (direction) {
            adj.get(uIdx).add(new Edge(v, weight));
        } else {
            adj.get(uIdx).add(new Edge(v, weight));
            adj.get(vIdx).add(new Edge(u, weight));
        }
    }

    // Method to print the adjacency list
    static void printAdjList(ArrayList<ArrayList<Edge>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print((char) (i + 'A') + " : { ");
            for (Edge edge : adj.get(i)) {
                System.out.print("(" + edge.vertex + " , " + edge.weight + "), ");
            }
            System.out.println("} ");
        }
    }

    // BellMan Ford Algorithm --> is used to find shortest path on negative weights
    // It also tells about the negative cycle
    static void bellmanFord(int V, char src, ArrayList<ArrayList<Edge>> adj){
        // distance arr
        int dist[] = new int[V];
        // initial state
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src - 'A'] = 0;

        // n-1 times relaxation 
        for(int i=1;i<V;i++){

            // traverse on entire edgeList i.e adj
            for (int uIdx = 0; uIdx < adj.size(); uIdx++) {
                char u = (char) (uIdx + 'A');

                for (Edge edge : adj.get(uIdx)) {
                    char v = edge.vertex;
                    int weight = edge.weight;

                    if (dist[u - 'A'] != Integer.MAX_VALUE && dist[u-'A'] + weight < dist[v-'A']) {
                        dist[v-'A'] = dist[u-'A'] + weight;
                    }
                }
            }
        }

        // after n-1 relaxation -> shortest distance ready h
        // check for -ve cycle  -->  uske liye ek baar or relaxation krna padega

        boolean anyUpdate = false;
        for (int uIdx = 0; uIdx < adj.size(); uIdx++) {
            char u = (char) (uIdx + 'A');

            for (Edge edge : adj.get(uIdx)) {
                char v = edge.vertex;
                int weight = edge.weight;

                if (dist[u - 'A'] != Integer.MAX_VALUE && dist[u-'A'] + weight < dist[v-'A']) {
                    anyUpdate = true;
                    break;
                    // dist[v-'A'] = dist[u-'A'] + weight;
                }
            }
        }

        if(anyUpdate){
            System.out.println("Negative Cycle present h ");
        }else{
            System.out.println("No negative cycle present");
            
            // printing distance array
            for(int ele : dist){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    
        // return;
    } 

    public static void main(String args[]) {
        int V = 5;  // Number of vertices
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>(V);
        
        // Initialize each adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Edge>());
        }

        addEdge(adj, 'A', 'B', -1, true);
        addEdge(adj, 'B', 'E', 2, true);
        addEdge(adj, 'E', 'D', -3, true);
        addEdge(adj, 'D', 'C', 5, true);
        addEdge(adj, 'A', 'C', 4, true);
        addEdge(adj, 'B', 'C', 3, true);
        addEdge(adj, 'B', 'D', 2, true);
        addEdge(adj, 'D', 'B', 1, true);

        printAdjList(adj);

        bellmanFord(V, 'A', adj);
    }
}
