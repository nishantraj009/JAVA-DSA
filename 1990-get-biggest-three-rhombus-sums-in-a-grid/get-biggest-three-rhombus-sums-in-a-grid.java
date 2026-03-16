import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        TreeSet<Integer> set = new TreeSet<>((a, b) -> b - a);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // k = 0 (single cell)
                set.add(grid[i][j]);

                // try all sizes
                for (int k = 1; ; k++) {
                    if (i - k < 0 || i + k >= m || j - k < 0 || j + k >= n)
                        break;

                    int sum = 0;

                    // 4 edges
                    // top → right
                    for (int t = 0; t < k; t++)
                        sum += grid[i - k + t][j + t];

                    // right → bottom
                    for (int t = 0; t < k; t++)
                        sum += grid[i + t][j + k - t];

                    // bottom → left
                    for (int t = 0; t < k; t++)
                        sum += grid[i + k - t][j - t];

                    // left → top
                    for (int t = 0; t < k; t++)
                        sum += grid[i - t][j - k + t];

                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());
        int[] res = new int[size];

        int idx = 0;
        for (int val : set) {
            if (idx == size) break;
            res[idx++] = val;
        }

        return res;
    }
}