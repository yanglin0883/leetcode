class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text==null||text.length()<7) return 0;
        int b=0, a=0, l=0, o=0, n=0;
        for(int i=0;i<text.length();i++){
            switch(text.charAt(i)){
                case 'a': a++; break; case 'b': b++; break; case 'l': l++; break;
                case 'o': o++; break; case 'n': n++;
            }
        }
        int min = Math.min(a,b);
        min = Math.min(min, n);
        min = Math.min(l/2, min);
        min = Math.min(o/2, min);
        //System.out.println(b+" "+a+" "+l+" "+o+" "+n+" "+min);
        return min;
    }
}