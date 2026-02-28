
import java.util.*;

public class DFSBasic {
    public static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for(int nei : adj.get(node)) {
            if(!visited[nei]) {
                dfs(nei, adj, visited);
            }
        }
    }
}
