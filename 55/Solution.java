class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        T1:for(int i=nums.length-1;i>-1;i--){
            if(nums[i]>0) continue;
            int j=i;
            for(j=i-1;j>-1;j--){
                System.out.println(i+" :: "+j);
                if(nums[j]>i-j){//����һ���ӣ���������ȥ�ģ�������λ�㣬 �γ�kmp
                    i=j;
                    continue T1;
                }
                if(i==nums.length-1 && nums[j]>=i-j){//���һ�����ǿӣ�����Ҫ����ȥ��ֻҪ����ȥ
                    i=j;
                    continue T1;
                }
            }
            if(j==-1) return false;
        }
        return true;
    }
}