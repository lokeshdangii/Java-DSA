import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Arrays;

// Class for weighted graphs
public class G03_Implementation {

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

    // Topological sorting
    static void topoOrderDfs(int src, Stack<Integer> stack, boolean visited[], ArrayList<ArrayList<Edge>> adj){
        visited[src] = true;

        for(Edge edge : adj.get(src)){
            int nbrEdge = edge.vertex;
            // int nbrDist = edge.weight;

            if(!visited[nbrEdge]){
                topoOrderDfs(nbrEdge, stack, visited, adj);
            }
        }

        stack.push(src);
    }

    // Shortest path of a weighted graph
    static void shortestPathDFS(Stack<Integer> stack, int V, ArrayList<ArrayList<Edge>> adj){ // V is no. of vertex
        int distArr[] = new int[V];  // distance array to store the shortest distance for each vertex

        // initializing array with max value
        for(int i=0;i<V;i++){
            distArr[i] = Integer.MAX_VALUE;
        }

        // stack me jo node top pr hogi wahi src node hogi --> so initially maintain source
        int src = stack.pop();
        distArr[src] = 0;


        // update nbr distance for this src node
        for(Edge edge : adj.get(src)){
            int nbrEdge = edge.vertex;
            int nbrDist = edge.weight;

            if(distArr[src] + nbrDist < distArr[nbrEdge]){
                distArr[nbrEdge] = distArr[src] + nbrDist;
            }
        }

        // apply the same above concept for every other node from the topo order stack
        while(!stack.isEmpty()){
            int source = stack.pop();

            for(Edge edge : adj.get(source)){
                int nbrEdge = edge.vertex;
                int nbrDist = edge.weight;
    
                if(distArr[source] + nbrDist < distArr[nbrEdge]){
                    distArr[nbrEdge] = distArr[source] + nbrDist;
                }
            }

        }

        // ab mera distance array ekdum tayyar h
        System.out.println("--- Printing the distance Array ------ ");
        for(int distance : distArr){
            System.out.print(distance + " ");
        }
        System.out.println();
    }


    // Dijkstra --> SSSP --> Single Source Shortest Path
    // Dijkstra doesn't work on unreachable node and on negative weights as well as on negative cycle
    static void diskstraShortestDistance(int V,ArrayList<ArrayList<Edge>> adj, int src, int dest){
        int dist[] = new int[V+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        // initial state
        pq.add(new Edge(src, 0));
        dist[src] = 0;

        // distance updation logic
        while(!pq.isEmpty()){
            Edge e = pq.remove();
            int topNOde = e.vertex;
            int topNodeDist = e.weight;

            // update distance of nbr
            for(Edge nbredge : adj.get(topNOde)){
                int nbrNode = nbredge.vertex;
                int nbrNodeDist = nbredge.weight;

                if(topNodeDist + nbrNodeDist < dist[nbrNode]){   // found a new shorter distance so update entry in pq as well as update distance array
                    dist[nbrNode] = topNodeDist + nbrNodeDist;
                    pq.remove(new Edge(nbrNode, dist[nbrNode])); // Remove old entry if it exists
                    pq.add(new Edge(nbrNode, dist[nbrNode]));    // Insert updated entry
                }
            }
        }
        System.out.println("Shortest distance between src node " + src + "and destination node " + dest + " is : " + dist[dest]);
        System.out.println("Shortest distance from source to every vertex : ");
        for(int d : dist){
            System.out.print(d + " ");
        }

    }

    static void relax(ArrayList<ArrayList<Edge>> adj, int u, int v){
        
    }

    public static void main(String[] args) {
        int V = 7;  // Number of vertices
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>(V);

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges with weights
        addEdge(adj,1,6,14,false);
        addEdge(adj,1,3,9,false);
        addEdge(adj,1,2,7,false);
        addEdge(adj,2,3,10,false);
        addEdge(adj,2,4,15,false);
        addEdge(adj,3,4,11,false);
        addEdge(adj,6,3,2,false);
        addEdge(adj,6,5,9,false);
        addEdge(adj,5,4,6,false);

        // Printing the adjacency list
        // printAdjList(adj);

        // int src = 0;
        // Stack<Integer> stack = new Stack<>();
        // boolean visited[] = new boolean[V];

        // topoOrderDfs(src, stack, visited, adj);
        // shortestPathDFS(stack, V, adj);

        diskstraShortestDistance(6, adj, 5, 2);
    }
}
