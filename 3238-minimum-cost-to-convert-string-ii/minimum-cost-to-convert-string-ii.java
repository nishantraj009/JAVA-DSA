import java.util.*;

class Solution {
    static class TrieNode {
        Map<Character, TrieNode> next = new HashMap<>();
        List<Integer> endIds = new ArrayList<>();
    }

    TrieNode root = new TrieNode();

    void insert(String s, int id) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            cur = cur.next.computeIfAbsent(c, k -> new TrieNode());
        }
        cur.endIds.add(id);
    }

    public long minimumCost(String source, String target, String[] original, String[] changed, int[] cost) {
        final long INF = (long) 1e18;
        int n = source.length();

        // ---------- Step 1: Collect unique strings ----------
        Set<String> set = new HashSet<>();
        for (String s : original) set.add(s);
        for (String s : changed) set.add(s);

        List<String> arr = new ArrayList<>(set);
        int m = arr.size();
        Map<String, Integer> id = new HashMap<>();
        for (int i = 0; i < m; i++) id.put(arr.get(i), i);

        // ---------- Step 2: Floyd-Warshall ----------
        long[][] dist = new long[m][m];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < original.length; i++) {
            int u = id.get(original[i]);
            int v = id.get(changed[i]);
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < m; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // ---------- Step 3: Group rules by original string ----------
        Map<String, List<int[]>> rules = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (dist[i][j] < INF) {
                    String o = arr.get(i);
                    String c = arr.get(j);
                    rules.computeIfAbsent(o, k -> new ArrayList<>())
                         .add(new int[]{j, (int) dist[i][j]});
                }
            }
        }

        // ---------- Step 4: Build Trie over originals ----------
        for (String o : rules.keySet()) insert(o, id.get(o));

        // ---------- Step 5: DP ----------
        long[] dp = new long[n + 1];
        Arrays.fill(dp, INF);
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            // No operation case
            if (source.charAt(i) == target.charAt(i)) {
                dp[i] = dp[i + 1];
            }

            // Trie walk from position i
            TrieNode cur = root;
            for (int j = i; j < n; j++) {
                char ch = source.charAt(j);
                if (!cur.next.containsKey(ch)) break;
                cur = cur.next.get(ch);

                for (int origId : cur.endIds) {
                    String origStr = arr.get(origId);
                    int len = origStr.length();
                    if (i + len > n) continue;

                    for (int[] pair : rules.get(origStr)) {
                        int changedId = pair[0];
                        long cst = pair[1];
                        String changedStr = arr.get(changedId);

                        if (target.startsWith(changedStr, i)) {
                            dp[i] = Math.min(dp[i], cst + dp[i + len]);
                        }
                    }
                }
            }
        }

        return dp[0] >= INF ? -1 : dp[0];
    }
}
