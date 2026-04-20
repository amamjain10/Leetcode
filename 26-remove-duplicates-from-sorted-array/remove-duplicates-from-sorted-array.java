class Solution {
    public static int removeDuplicates(int[] nums) {
        int j=0;
        nums[j]=nums[0];
        j++;
        int count=1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[j]=nums[i];
                    j++;
                }

            }
            
            return j;
    }
   
}