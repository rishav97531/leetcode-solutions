class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        int distance = n;

        // Left to Right
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            ans[i] = distance;
        }

        // Right to Left
        distance = n;

        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            ans[i] = Math.min(ans[i], distance);
        }

        return ans;
    }
}



///time complexity = 0(n)
///space complexity = 0(n)