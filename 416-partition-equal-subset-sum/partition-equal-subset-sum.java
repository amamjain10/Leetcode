class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int n: nums){
            totalSum += n;
        }
        if(totalSum %2 != 0) return false;

        int target= totalSum/2;

        boolean[] dp =new boolean[target +1];
        dp[0]=true;
        for(int n:nums){
            for(int curr =target;curr>=n;curr--){
                dp[curr]=dp[curr] ||dp[curr-n];
                if(dp[target]) return true;
            }
        }
        return dp[target];
    }
}