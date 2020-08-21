class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
        int res=0;
        Arrays.sort(r, (p1, p2)->p1[0]-p2[0]);
        res+= (r[0][0]-1 + n-r[r.length-1][0])*2;
        int pre=r[0][0];
        boolean[] temp = new boolean[11];
        Arrays.fill(temp, true);
        for(int i=0;i<r.length;i++){            
            if(r[i][0]==pre){
                temp[r[i][1]] = false;                
            }
            else{
                res+= 2* (r[i][0]-pre-1);
                res+= check(temp);
                temp[r[i][1]] = false;                 
                pre = r[i][0];
            }
            // System.out.println(i+" : "+res);
        }
        res+=check(temp);
        return res;
    }
    int check(boolean[] a){
        int res=0;
        if(a[2]&&a[3]&&a[4]&&a[5]&&a[6]&&a[7]&&a[8]&&a[9]) res=2;
        else if((a[2]&&a[3]&&a[4]&&a[5])||
                (a[4]&&a[5]&&a[6]&&a[7])||
               (a[6]&&a[7]&&a[8]&&a[9])) res=1;
        // for(boolean i: a) System.out.print(i+" ");
        // System.out.println();
        Arrays.fill(a, true);
        return res;
    }
}