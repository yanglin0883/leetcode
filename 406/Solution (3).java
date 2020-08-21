class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        int[][] a = new int[people.length][2];
        for(int i=0;i<a.length;i++)a[i][0] = -1;
        for(int[] i:people){
            int t=0;
            for(int j=0;j<a.length;j++){
                // System.out.println(t);
                if(t==i[1] && a[j][0]==-1){
                    a[j] = i;
                    break;
                }
                if(a[j][0]==-1 || a[j][0]>=i[0]) t++;
            }
        // for(int[] p:a)System.out.print(Arrays.toString(p));
        //     System.out.println();
        }
        return a;
    }
}