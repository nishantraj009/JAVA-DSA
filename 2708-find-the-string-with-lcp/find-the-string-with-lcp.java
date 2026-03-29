class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;

        // Step 1: diagonal check
        for (int i = 0; i < n; i++) {
            if (lcp[i][i] != n - i) return "";
        }

        char[] word = new char[n];
        Arrays.fill(word, '?');

        // Step 2: assign characters
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            if (word[i] == '?') {
                if (ch > 'z') return "";
                
                for (int j = i; j < n; j++) {
                    if (lcp[i][j] > 0) {
                        word[j] = ch;
                    }
                }
                ch++;
            }
        }

        // Step 3: validate
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (word[i] == word[j]) {
                    dp[i][j] = 1;
                    if (i + 1 < n && j + 1 < n) {
                        dp[i][j] += dp[i + 1][j + 1];
                    }
                } else {
                    dp[i][j] = 0;
                }

                if (dp[i][j] != lcp[i][j]) return "";
            }
        }

        return new String(word);
    }
}