import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Tarjan's Algorithm --> Bridge in Graph/ Critical connections in a N/W
public class G06_Tarjans_Algo{
    void solve(int src, int parent, List<List<Integer>> adj, int timer, List<List<Integer>> ans, int low[], int tin[], boolean visited[]){
        
        visited[src] = true;
        tin[src] = timer;
        low[src] = timer;
        timer++;

        // nbrss
        for(int nbr : adj.get(src)){
            if(nbr == parent){
                // ignore this
                continue;
            }

            if(!visited[nbr]){
                // step1
                solve(nbr,src,adj, timer, ans, tin, low, visited);
                // low update
                low[src] = Math.min(low[src], low[nbr]);

                // bridge testing
                if(low[nbr] > tin[src]){
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(src);
                    tmp.add(nbr);
                    ans.add(tmp);
                }
            }else{ // ek o
                low[src] = Math.min(low[src], low[nbr]);
            }
        }   
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

         for(List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // main logic
        int timer = 1;
        int src = 0;
        int parent = -1;
        List<List<Integer>> ans = new ArrayList<>();
        int low[] = new int[n];
        int tin[] = new int[n];
        boolean visited[] = new boolean[n];

        Arrays.fill(low,0);
        Arrays.fill(tin,0);
        
        solve(src, parent, adj, timer, ans, tin, low, visited);
        return ans;

    }
}