class Solution {
    public int numTeams(int[] rating) {
        if(rating.length<3) return 0;
        int res=0;
        for(int i=0;i<rating.length;i++)
            for(int j=i+1;j<rating.length;j++)
                for(int k=j+1;k<rating.length;k++){
                    if(check(rating, i, j, k)) res++;
                }
        return res;
    }
    boolean check(int[] a, int i, int j,int k){
        return a[i]<a[j]&&a[j]<a[k] || a[i]>a[j]&&a[j]>a[k];
    }
}