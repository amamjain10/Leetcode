class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int num:map.keySet()){
            int val= map.get(num);
            if(val>max){
                max= val;
            }
        }
        int ans=0;
        for(int num: map.keySet()){
            int val2= map.get(num);
            if(val2==max){
                ans+=val2;
            }
        }
        return ans;
    }
}