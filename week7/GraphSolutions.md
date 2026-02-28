
# Graph Solutions

## 1) Keys and Rooms
Link: https://leetcode.com/problems/keys-and-rooms/

Approach:
- Treat each room as a node in a graph.
- If a room contains keys, they represent edges to other rooms.
- Start from room 0.
- Use DFS or BFS to visit all reachable rooms.
- Maintain a visited array.
- If all rooms are visited at the end, return true; otherwise false.

Time Complexity: O(N + E)
Space Complexity: O(N)

---

## 2) Number of Provinces
Link: https://leetcode.com/problems/number-of-provinces/

Approach:
- The input is given as an adjacency matrix.
- Convert the matrix into adjacency list or traverse directly.
- Each connected component represents one province.
- Use DFS or BFS to traverse all connected cities.
- Count how many times DFS/BFS is called on an unvisited city.

Time Complexity: O(N^2)
Space Complexity: O(N)
