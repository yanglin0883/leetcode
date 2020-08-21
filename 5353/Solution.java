class Solution {
    public int numTimesAllBlue(int[] light) {
        int count=0;
        boolean on[] = new boolean[light.length];
        int index=-1;
        for(int i=0;i<light.length;i++){
            on[light[i]-1] = true;
            // System.out.println(index);
            while(on[index+1]){
                index++;
                if(index==on.length-1)break;
            }
            if(index==i) count++;
        }
        return count;
    }
}