import java.util.*;

public class G04_FloydWarshal {
    // Custom class to store edges with weights
    static class Edge implements Comparable<Edge> {
        int vertex;
        int weight;

        Edge(int v, int w) {
            vertex = v;
            weight = w;
        }

        @Override
        public int compareTo(Edge e2){
            return this.weight-e2.weight;
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

    static void floydWarshal(int V, ArrayList<ArrayList<Edge>> adj){
        // initial state
        int dist[][] = new int[V][V];

        // Fill the distance array with Integer.MAX_VALUE
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        // diagonal pr 0 fill krna h
        for(int i=0;i<V;i++){
            dist[i][i] = 0;
        }

        // kuch weights graph k andar bhi given h --> update distance array accordingly
        for (int uIdx = 0; uIdx < adj.size(); uIdx++) {
            int u = uIdx; 

            for (Edge edge : adj.get(uIdx)) {
                int v = edge.vertex;
                int weight = edge.weight;
                dist[u][v] = weight;
            }
        }
        
        // main logic - helper logic
        for(int helper=0;helper<V;helper++){
            for(int src=0;src<V;src++){
                for(int dest=0;dest<V;dest++){
                    dist[src][dest] = Math.min(dist[src][dest], (dist[src][helper] + dist[helper][dest]));
                }
            }
        }

        // printing distance array
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    
    }

    public static void main(String[] args) {
        int V = 4;  // Number of vertices
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>(V);

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges with weights
        addEdge(adj,0,1,3,true);
        addEdge(adj,1,0,2,true);
        addEdge(adj,0,3,5,true);
        addEdge(adj,1,3,4,true);
        addEdge(adj,3,2,2,true);
        addEdge(adj,2,1,1,true);

        floydWarshal(V, adj);

}
}
