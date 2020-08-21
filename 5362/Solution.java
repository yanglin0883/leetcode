class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length()) return false;
        int[] letters = new int[26];
        for(char c: s.toCharArray()){
            letters[c-'a']++;
        }
        
        System.out.println(k);
        for(int i:letters) System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<26;i++){
            if((letters[i]%2==1)){
                letters[i]--;
                k--;
            }
        }
        if(k<0)return false;
        Arrays.sort(letters);
        System.out.println(k);
        for(int i:letters) System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<26&&k!=0;i++){
            if(letters[i]==0)continue;
            if(k>0){
                int min = Math.min(letters[i], k);
                if((letters[i]-min)%2==1) min--;
                k-=min;
                letters[i]-=min;
            }
        }
        System.out.println(k);
        for(int i:letters) System.out.print(i+" ");
        System.out.println();
        if(k==0) return true;
        int dig=0;
        for(int i: letters)
            if(i>0&&(i%2)==0) dig+=i/2;
        if(dig>=k) return true;
        return dig>2;
    }
}