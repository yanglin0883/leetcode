class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        if(arr2.length==0){            
            return arr1;
        }
        boolean[] exist = new boolean[arr1.length];
        int[] num = new int[arr2.length];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]) {
                    num[i]++;
                    exist[j] = true;
                }                
            }
        }
        int[] res = new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<num[i];j++)
                res[index++]=arr2[i];
        }
        //int end = index;
        for(int i=0;i<arr1.length;i++){
            if(!exist[i]) res[index++] = arr1[i];
        }
        return res;
    }
}