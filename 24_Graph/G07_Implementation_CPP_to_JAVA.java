import java.util.*;

// Class Based Implementation of Graph.

public class G07_Implementation_CPP_to_JAVA{
    static class Graph<T> {
        public HashMap<T, List<Pair<T, Integer>>> adjList = new HashMap<>();
    
        // U and V are used so that we can make pair of two diffrent data types
        static class Pair<U, V> {
            public U first;
            public V second;
    
            public Pair(U first, V second) { 
                this.first = first;
                this.second = second;
            }
        }
    
        public void addEdge(T u, T v, int wt, boolean direction) {
            if (!adjList.containsKey(u)) {
                adjList.put(u, new LinkedList<>());
            }
            if (!adjList.containsKey(v)) {
                adjList.put(v, new LinkedList<>());
            }
            if (direction) {
                adjList.get(u).add(new Pair<>(v, wt));
            } else {
                adjList.get(u).add(new Pair<>(v, wt));
                adjList.get(v).add(new Pair<>(u, wt));
            }
        }
    
        public void printAdjList() {
            for (Map.Entry<T, List<Pair<T, Integer>>> entry : adjList.entrySet()) {
                System.out.print(entry.getKey() + ": {  ");
                for (Pair<T, Integer> p : entry.getValue()) {
                    System.out.print("{" + p.first + ", " + p.second + "}, ");
                }
                System.out.println("}");
            }
        }
    
        public void bfsTraversal(T src, Map<T, Boolean> vis) {
            Queue<T> q = new LinkedList<>();
            q.add(src);
            vis.put(src, true);
    
            while (!q.isEmpty()) {
                T frontNode = q.poll();
                System.out.print(frontNode + " ");
    
                for (Pair<T, Integer> nbr : adjList.get(frontNode)) {
                    T nbrData = nbr.first;
                    if (!vis.get(nbrData)) {
                        q.add(nbrData);
                        vis.put(nbrData, true);
                    }
                }
            }
        }
    
        public void dfs(T src, Map<T, Boolean> vis) {
            vis.put(src, true);
            System.out.print(src + " ");
    
            for (Pair<T, Integer> nbr : adjList.get(src)) {
                T nbrData = nbr.first;
                if (!vis.get(nbrData)) {
                    dfs(nbrData, vis);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Graph<Character> g = new Graph<>();
        g.addEdge('a', 'b', 5, false);
        g.addEdge('c', 'd', 20, false);
        g.addEdge('c', 'e', 50, false);
        g.addEdge('d', 'e', 20, false);
        g.addEdge('e', 'f', 50, false);

        g.printAdjList();

        Map<Character, Boolean> visited = new HashMap<>();
        for (char node = 'a'; node <= 'f'; node++) {
            visited.put(node, false);
        }

        for (char node = 'a'; node <= 'f'; node++) {
            if (!visited.get(node)) {
                g.dfs(node, visited);
            }
        }

        // To check number of disconnected components:
        // int components = 0;
        // for (char node = 'a'; node <= 'f'; node++) {
        //     if (!visited.get(node)) {
        //         g.dfs(node, visited);
        //         components++;
        //     }
        // }
        // System.out.println("Number of disconnected components: " + components);
    }
}

