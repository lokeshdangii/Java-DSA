import java.util.*;
public class G01_Implementation{

    // addEdge in Graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
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

    // BFS and DFS are used to count connected component in an undirected graph
    // BFS     // v-> no. of vertex   s-> source node(-> starting point )
    static void bfsTraversal(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean visited[]){ 
      //visited is used to track that element should be only visited once
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int key = q.poll();
            System.out.print(key + " ");

            for(int value : adj.get(key)){
                if(visited[value] == false){
                    visited[value] = true;
                    q.add(value);
                }
            }
        }

    }

    // BFS Second Version --> No source is given and graph may be disconnected
    static void bfsDisconnected(ArrayList<ArrayList<Integer>> adj, int v){  // TC -> O(V+E)
        boolean visited[] = new boolean[v];
        int count = 0;
        for(int i=0;i<v;i++){
            if(visited[i] == false){
                bfsTraversal(adj, v, i, visited);
                count ++;
            }
        }

        System.out.println("number of unconnected component " + count);
    }

    // DFS  --> dfs and dfsRecursive will work together for DFS   TC -> O(V+E)
    static void dfs(ArrayList<ArrayList<Integer>> adj, int V){
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++){
            if(visited[i] == false){
                dfsRecursive(adj, i, visited);
            }
        }
        System.out.println();
    }

    // DFS
    static void dfsRecursive(ArrayList<ArrayList<Integer>> adj,int s, boolean visited[]){
        visited[s] = true;
        System.out.print(s + " ");

        for(int u : adj.get(s)){
            if(visited[u] == false){
                dfsRecursive(adj, u, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);

        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);

        // printGraph(adj);
        // bfsTraversal(adj, V, 0 );
        bfsDisconnected(adj, V);
        dfs(adj, V);

    }
}