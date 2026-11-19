class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int longest =1;
        int last_small= Integer.MIN_VALUE;
        int count =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==last_small+1){
                last_small= nums[i];
                count++;
                longest= Math.max(count,longest);
            }
            if(nums[i] > last_small+1){
                last_small = nums[i];
                count=1;
            }
        }
        return longest;

    }
}