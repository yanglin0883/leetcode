class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
        int res=0;
        Arrays.sort(r, (p1, p2)->p1[0]-p2[0]);
        int j=0;
        for(int i=1;i<=n;i++){
            int[] temp = new int[11];
            while(j<r.length&&r[j][0]==i){
                temp[r[j][1]]++;
                j++;
            }
            if(temp[2]==0&&temp[3]==0&&temp[4]==0&&temp[5]==0&&temp[6]==0&&temp[7]==0&&temp[8]==0&&temp[9]==0) res+=2;
            else if((temp[2]==0&&temp[3]==0&&temp[4]==0&&temp[5]==0)
               ||(temp[4]==0&&temp[5]==0&&temp[6]==0&&temp[7]==0)
               ||(temp[6]==0&&temp[7]==0&&temp[8]==0&&temp[9]==0)) res++;
            // System.out.println(res);
        }
        return res;
    }
}