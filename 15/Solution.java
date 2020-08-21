class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length<3) return res;
        
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i: nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(Integer i: hm.keySet()){
            if(i.equals(0)&&hm.get(0)>2){
                al.add(0);
            }            
            for(int j=0;j<2&&j<hm.get(i).intValue();j++)
                al.add(i);            
        }
        nums = new int[al.size()];
        for(int i=0;i<nums.length;i++){
            nums[i] = al.get(i);
        }
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length&&nums[i]<=0;i++){
            //if(i>0 && nums[i] == nums[i-1]) continue;
            //int n=i;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                // left = n+1;
                // right = nums.length-1;
                while(left<right && nums[left]+ nums[right]+nums[i]<0) left++;
                while(left<right && nums[left]+ nums[right]+nums[i]>0) right--;
                if(left<right &&nums[left]+ nums[right]+nums[i]==0){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left++;
                    right--;
                    // break;                    
                }
                //n++;
                // System.out.println(left+"  "+right);
            }
            // System.out.println(res);
        }
        // System.out.println(res);
        for(int i=0;i<res.size();i++){
            for(int j=i+1;j<res.size();){
                // System.out.println("i= "+i+" j= "+j);
                if(res.get(i).get(0).equals(res.get(j).get(0))&&                 
                   res.get(i).get(1).equals(res.get(j).get(1))&&
                   res.get(i).get(2).equals(res.get(j).get(2)))
                {
                    // System.out.println(res.get(j));
                    res.remove(j);                    
                }
                else j++;
            }
        }
        return res;
    }
}