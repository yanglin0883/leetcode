class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
        for(int i=0;i<dominoes.length-1;i++){
            for(int j=i+1;j<dominoes.length;j++)
                if(equiv(dominoes[i], dominoes[j])) count++;
        }
        return count;
    }
    private boolean equiv(int a[], int b[]){
        return (a[0]==b[0] && a[1]==b[1]) || (a[0]==b[1] &&a[1]==b[0]);
    }
}