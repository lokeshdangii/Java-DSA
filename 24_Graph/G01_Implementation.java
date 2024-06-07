import java.util.*;
public class G01_Implementation{

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

    // Topological Sorting
    // --> TS is a Linear ordering of vertices such that for edge (u->v) u comes before v in that ordering
    // Toplogical sorting can only be applied on DAG (Directed Acyclic Graph)
    // Topological Sort me pehli node kisi pr depend nhi krti h 
    // TS --> by DFS
    static void topologicalSortDFS(int src, boolean visited[], Stack<Integer> s, ArrayList<ArrayList<Integer>> adj ){
        visited[src] = true;

        for(int nbr : adj.get(src)){
            if(visited[nbr] == false){
                topologicalSortDFS(nbr, visited, s, adj);
            }
        }

        s.push(src);
    }

    // TS --> by BFS
    // jis bhi node ki indegree 0 h wo queue me push hogi iska matlab jo bhi node independent hogi queue me sirf wahi push hogi
    static void topologicalSortBFS()

    public static void main(String[] args) {
        int V=8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        // addEdge(adj, 0, 1);
        // addEdge(adj, 0, 2);
        // addEdge(adj, 1, 3);
        // addEdge(adj, 2, 3);

        // addEdge(adj, 4, 5);
        // addEdge(adj, 4, 6);
        // addEdge(adj, 5, 6);

        // printGraph(adj);
        // bfsTraversal(adj, V, 0 );
        // bfsDisconnected(adj, V);
        // dfs(adj, V);

        addEdge(adj, 0, 1,true);
        addEdge(adj, 1, 2,true);
        addEdge(adj, 2, 3,true);
        addEdge(adj, 3, 4,true);
        addEdge(adj, 3, 5,true);
        addEdge(adj, 4, 6,true);
        addEdge(adj, 5, 6,true);
        addEdge(adj, 6, 7,true);
        
        
        boolean visited [] = new boolean[V];
        Stack<Integer> s = new Stack<>();

        for(int node=0;node<V;node++){
            if(!visited[node]){
                topologicalSortDFS(node, visited, s, adj);
            }
        }


        System.out.println(".....Printing Topological Sort order .....");
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }

    }
}