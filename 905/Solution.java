class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        Arrays.sort(A);
        int left=0, right = res.length-1;
        for(int i=0;i<A.length;i++)
            if(A[i] % 2 ==0) res[left++] = A[i];
            else res[right--] = A[i];
        return res;
    }
}