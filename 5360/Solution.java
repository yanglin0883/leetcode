class Solution {
    public int countLargestGroup(int n) {
        int res[] = new int[37];
        for(int i=1;i<=n;i++){
            int temp = i;
            int sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            // System.out.println(sum+"  "+i);
            res[sum]++;
        }
        int max = 0;
        for(int i:res) max = Math.max(max, i);
        int count=0;
        for(int i=0;i<37;i++)
            if(res[i]==max)count++;
        return count;
    }
}