class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        k--;
        int total=1;
        for(int i=1;i<=n;i++)
            total*=i;
        StringBuilder sb = new StringBuilder();
        while(total>1){
            total/= n--;
            int q = k/total;
            // System.out.println(q+"  "+k+"  "+total);
            k = k%total;
            // System.out.println(" "+nums);
            sb.append(nums.get(q));
            nums.remove(q);
        }
        sb.append(nums.get(0));
        return sb.toString();
    }
}