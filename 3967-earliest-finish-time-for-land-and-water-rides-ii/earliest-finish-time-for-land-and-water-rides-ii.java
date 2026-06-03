/*         Scroll down to see JAVA code also        */
/*
    MY YOUTUBE VIDEO ON THIS Qn : https://www.youtube.com/watch?v=R94VBJJoqTU
    Company Tags                : will update later
    Leetcode-3633 Link          : https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/
    Leetcode-3635 Link          : https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/
*/


/*********************************************************** C++ **************************************************/

//T.C : O(n+m)
//S.C : O(1)

class Solution {

    private int findFinishTime(int[] start1, int[] duration1, int[] start2, int[] duration2) {

        int finish1 = Integer.MAX_VALUE;
        for (int i = 0; i < start1.length; i++) {
            finish1 = Math.min(finish1, start1[i] + duration1[i]);
        }

        int finish2 = Integer.MAX_VALUE;
        for (int i = 0; i < start2.length; i++) {
            finish2 = Math.min(finish2, Math.max(finish1, start2[i]) + duration2[i]);
        }

        return finish2;
    }

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int pehleLand_FirWater = findFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);

        int pehleWater_FirLand = findFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);

        return Math.min(pehleLand_FirWater, pehleWater_FirLand);
    }
}