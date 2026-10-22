
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];

        for (int i = 1; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalhrs = CalculateTotalHrs(piles, mid);

            if (totalhrs <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // helper function 

    public long CalculateTotalHrs(int[] piles, int hourly) {
        long totalhrs = 0;

        for (int i = 0; i < piles.length; i++) {
            totalhrs += (piles[i] + (long) hourly - 1) / hourly;
        }

        return totalhrs;
    }
}
