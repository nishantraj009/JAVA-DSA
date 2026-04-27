import java.util.*;

class Solution {
    
    // Directions: {dx, dy}
    int[][] dirs = {
        {0, -1}, // left
        {0, 1},  // right
        {-1, 0}, // up
        {1, 0}   // down
    };
    
    // Mapping for each type → allowed directions index
    int[][] typeDirs = {
        {},
        {0, 1},       // type 1
        {2, 3},       // type 2
        {0, 3},       // type 3
        {1, 3},       // type 4
        {0, 2},       // type 5
        {1, 2}        // type 6
    };
    
    // Check if next cell accepts connection
    public boolean isConnected(int fromDir, int nextType) {
        // opposite direction
        int opp = fromDir == 0 ? 1 : fromDir == 1 ? 0 : fromDir == 2 ? 3 : 2;
        
        for (int d : typeDirs[nextType]) {
            if (d == opp) return true;
        }
        return false;
    }
    
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0, 0});
        vis[0][0] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            
            if (x == m - 1 && y == n - 1) return true;
            
            int type = grid[x][y];
            
            for (int d : typeDirs[type]) {
                int nx = x + dirs[d][0];
                int ny = y + dirs[d][1];
                
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || vis[nx][ny]) continue;
                
                int nextType = grid[nx][ny];
                
                if (isConnected(d, nextType)) {
                    vis[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        
        return false;
    }
}