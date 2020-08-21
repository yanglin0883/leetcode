class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people.length==0) return people;
        
        for(int i=0;i<people.length-1;i++){
            int min = i;
            int j=i+1;
            for(j=i+1;j<people.length;j++){
                if(lessThan(people[j],people[min]))
                   min=j;
                // System.out.println(min+" ; "+i+" :: "+j);
            }
            
            if(min!=i){
                int temp0=people[min][0]; int temp1 = people[min][1];
                people[min][0] =people[i][0];people[min][1] =people[i][1];
                people[i][0] = temp0;people[i][1] = temp1;
            }
            
        }
        // for(int a=0;a<people.length;a++)
        //     System.out.println(people[a][0]+" :: "+people[a][1]);
        
        int[][] res = new int[people.length][2];
        for(int i=0;i<res.length;i++)
            res[i][0]=-1;
        for(int i=0;i<people.length;i++){
            fill(res, people[i]);
        }
        return res;
    }
    
    private boolean lessThan(int[] a, int[] b){
        //System.out.println(min[0]+" "+min[1]+" :: "+node[0]+"  "+node[1]);
        if(a[0]>b[0])
            return false;
        if(a[0]<b[0]) return true;
        return a[1]<b[1];
    }
                   
    private void fill(int[][] res, int[] node){
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i][0]!=-1){
                if(node[0]<=res[i][0])count++;
            }
            else{
                if(count++==node[1]){
                    res[i]=node;
                    return;
                }
            }
        }
    }
}