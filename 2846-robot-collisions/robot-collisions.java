import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        
        // Step 1: combine and sort
        int[][] robots = new int[n][4]; // pos, health, dir, index
        for (int i = 0; i < n; i++) {
            robots[i][0] = positions[i];
            robots[i][1] = healths[i];
            robots[i][2] = directions.charAt(i);
            robots[i][3] = i;
        }
        
        Arrays.sort(robots, (a, b) -> a[0] - b[0]);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            if (robots[i][2] == 'R') {
                stack.push(i);
            } else {
                // direction L
                while (!stack.isEmpty() && robots[i][1] > 0) {
                    int j = stack.peek();
                    
                    if (robots[j][1] < robots[i][1]) {
                        // R robot dies
                        stack.pop();
                        robots[i][1]--;
                        robots[j][1] = 0;
                    } else if (robots[j][1] > robots[i][1]) {
                        // L robot dies
                        robots[j][1]--;
                        robots[i][1] = 0;
                    } else {
                        // both die
                        stack.pop();
                        robots[j][1] = 0;
                        robots[i][1] = 0;
                    }
                }
            }
        }
        
        // collect survivors
        int[] result = new int[n];
        Arrays.fill(result, -1);
        
        for (int i = 0; i < n; i++) {
            if (robots[i][1] > 0) {
                result[robots[i][3]] = robots[i][1];
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int x : result) {
            if (x != -1) ans.add(x);
        }
        
        return ans;
    }
}