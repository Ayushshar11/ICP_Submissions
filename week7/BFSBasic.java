
import java.util.*;

public class BFSBasic {
    public static void bfs(int start, List<List<Integer>> adj, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for(int nei : adj.get(node)) {
                if(!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }
}
