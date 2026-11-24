class Solution {
    public boolean can(int[] position,int m,int mid){
        int count=1;
        int last= position[0];
        for(int i=1;i<position.length;i++){
            if(position[i] >= mid + last){
                count++;
                last =position[i];
            }
            if(count>=m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int r=position[position.length -1]-position[0];
        int ans=0;
        while(l<=r){
            int mid= l +(r-l)/2;
            if(can(position,m,mid)){
                ans=mid;
                l= mid+1;
            }
            else{
                r= mid-1;
            }
        }
        return ans;
    }
}