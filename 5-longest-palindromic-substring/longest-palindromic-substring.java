class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String res= "";
        for(int i=1;i<s.length();i++){
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1||high==s.length()){
                    break;
                }
            }
            String ans= s.substring(low+1,high);
            if(ans.length()>res.length()){
                res= ans;
            }
            

            low= i-1;
            high=i;
            while(s.charAt(low) ==s.charAt(high)){
                low--;
                high++;
                if( low ==-1||high==s.length()){
                    break;
                }
            }
            String ans2=s.substring(low+1,high);
            if(ans2.length()>res.length()){
                res= ans2;
            }

        }
        return res;
    }
}