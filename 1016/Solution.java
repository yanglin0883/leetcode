class Solution {
    public boolean queryString(String S, int N) {
        for(int i=1;i<=N;i++){
            String temp = Integer.toBinaryString(i);
            // System.out.println(i);
            if(!contains(S, temp)) return false;
        }
        return true;
    }
    
    private boolean contains(String s, String target){
        // System.out.println(target);
        t1:
        for(int i=0;i<s.length();i++){
            int j=0;
            while(s.charAt(i+j)==target.charAt(j)){
                if(++j==target.length()) return true;
                if(i+j>=s.length()) break t1;
            }
            // i+=j;
        }
        return false;
    }
}