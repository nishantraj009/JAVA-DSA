import java.util.*;

class Solution {
    static class State {
        int r, c, t, cost;
        State(int r, int c, int t, int cost) {
            this.r = r;
            this.c = c;
            this.t = t;
            this.cost = cost;
        }
    }

    static class Cell {
        int val, r, c;
        Cell(int v, int r, int c) {
            this.val = v;
            this.r = r;
            this.c = c;
        }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int INF = Integer.MAX_VALUE / 4;

        int[][][] dist = new int[m][n][k + 1];
        for (int[][] a : dist)
            for (int[] b : a)
                Arrays.fill(b, INF);

        dist[0][0][0] = 0;

        
        List<Cell> cells = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells.add(new Cell(grid[i][j], i, j));
        cells.sort(Comparator.comparingInt(a -> a.val));

        
        boolean[][][] used = new boolean[m][n][k + 1];

        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.offer(new State(0, 0, 0, 0));

      
        int[][] ptr = new int[k + 1][1]; 

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int r = cur.r, c = cur.c, t = cur.t, cost = cur.cost;

            if (cost != dist[r][c][t]) continue;
            if (r == m - 1 && c == n - 1) return cost;

            
            if (r + 1 < m && dist[r + 1][c][t] > cost + grid[r + 1][c]) {
                dist[r + 1][c][t] = cost + grid[r + 1][c];
                pq.offer(new State(r + 1, c, t, dist[r + 1][c][t]));
            }
            if (c + 1 < n && dist[r][c + 1][t] > cost + grid[r][c + 1]) {
                dist[r][c + 1][t] = cost + grid[r][c + 1];
                pq.offer(new State(r, c + 1, t, dist[r][c + 1][t]));
            }


            if (t < k) {
                int p = ptr[t][0];
                while (p < cells.size() && cells.get(p).val <= grid[r][c]) {
                    Cell cell = cells.get(p);
                    if (dist[cell.r][cell.c][t + 1] > cost) {
                        dist[cell.r][cell.c][t + 1] = cost;
                        pq.offer(new State(cell.r, cell.c, t + 1, cost));
                    }
                    p++;
                }
                ptr[t][0] = p;
            }
        }

        return -1;
    }
}
