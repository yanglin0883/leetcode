class Solution {
    public int findGoodStrings(int n, String s1, String s2, String evil) {
        if(s1.compareTo(s2)>0) return 0;
        long res=0;
        for(String i=s1;i.compareTo(s2)<=0;i=next(i)){
            if(i.contains(evil))continue;
            res++;
        }
        return (int)(res % 1000000007);
    }
    String next(String i){
        char[] res = i.toCharArray();
        int index = res.length-1;
        while(res[index]>='z')index--;
        if(index==res.length-1){
            res[index]++;
            return new String(res);
        }else{
            res[index]++;
            for(index++;index<res.length;index++)
                res[index]='a';
            return new String(res);
        }
    }
}