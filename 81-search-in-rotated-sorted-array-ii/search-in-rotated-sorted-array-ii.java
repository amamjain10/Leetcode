class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high =nums.length -1;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(nums[mid]== target||nums[low]== target||nums[high]==target) return true;
            if(nums[mid]==nums[low]&&nums[mid]==nums[high]){
                low= low+1;
                high =high-1;
                continue;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low]<= target && target <= nums[mid]){
                    high= mid-1;

                }
                else{
                    low= mid+1;
                }
            }
            if(nums[mid] <= nums[high]){
                if(nums[mid] <= target && target <= nums[high]){
                    low= mid+1;
                }
                else{
                    high= mid-1;
                }
            }
        }
        return false;
    }
}