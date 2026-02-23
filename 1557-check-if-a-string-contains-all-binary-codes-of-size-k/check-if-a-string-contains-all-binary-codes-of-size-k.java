class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        boolean[] seen = new boolean[need];
        int mask = need - 1;
        int cur = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            cur = ((cur << 1) & mask) | (s.charAt(i) - '0');
            if (i >= k - 1 && !seen[cur]) {
                seen[cur] = true;
                count++;
                if (count == need) return true;
            }
        }
        return false;
    }
}