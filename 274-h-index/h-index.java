class Solution {
    public int hIndex(int[] citations) {
        int n= citations.length;
        int buk[] = new int[n+1];

        for(int i=0;i<n;i++){
            int x= citations[i];
            if(x>=n){
                buk[n]++;
            }
            else{
                buk[x]++;
            }
        }
        int count=0;
        for(int i=n;i>=0;i--){
            count += buk[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}