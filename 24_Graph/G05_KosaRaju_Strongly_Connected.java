import java.util.ArrayList;
import java.util.Stack;

public class G05_KosaRaju_Strongly_Connected{

     // addEdge in Graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v, boolean direction){

        if(direction){
            adj.get(u).add(v);
        }else{
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
    }

     // print Graph
     static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            System.out.print(i + "--> ");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // dfs function to maintain ordering for KosaRaju Algo
    static void dfs1(int node, Stack<Integer> ordering, boolean visited[], ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;

        for(int nbr : adj.get(node)){
            if(!visited[nbr]){
                dfs1(nbr,ordering,visited, adj);
            }
        }

        // waps aate huwe stack me push
        ordering.push(node);
    }

    static void dfs2(int src, boolean visited2[], ArrayList<ArrayList<Integer>> adjNew){
        visited2[src] = true;
        System.out.print(src + ", ");

        for(int nbr : adjNew.get(src)){
            if(!visited2[nbr]){
                dfs2(nbr, visited2, adjNew);
            }
        }

    }

    // KosaRaju Algorithm --> Strongly Connected component 
    static int getStronglyConnectedComponent(int V, ArrayList<ArrayList<Integer>> adj){
        // Step1: Get the ordering
        Stack<Integer> ordering = new Stack<>();
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs1(i,ordering,visited, adj);
            }
        }

        // Step2: reverse edges
        ArrayList<ArrayList<Integer>> adjNew = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adjNew.add(new ArrayList<>());
        }

        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                // v -> u ki entry create krni h
                adjNew.get(v).add(u);
            }
        }

        // step3: traverse using ordering and count components
        int count = 0;
        boolean visited2[] = new boolean[V];

        while (!ordering.isEmpty()) {
            int node = ordering.pop();
            if(!visited2[node]){
                System.out.print("SCC #" + (count+1) + ": ");
                dfs2(node, visited2, adjNew);
                count++;
                System.out.println();

            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int V=8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1, true);
        addEdge(adj, 1, 2, true);
        addEdge(adj, 2, 3, true);
        addEdge(adj, 3, 0, true);
        addEdge(adj, 2, 4, true);
        addEdge(adj, 4, 5, true);
        addEdge(adj, 5, 6, true);
        addEdge(adj, 6, 4, true);
        addEdge(adj, 6, 7, true);

        int ans = getStronglyConnectedComponent(V, adj);
        System.out.println("Strongly Connected Component : " + ans);
    }
}