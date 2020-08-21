class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            hm1.put(nums1[i], hm1.getOrDefault(nums1[i],0)+1);
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hm1.get(nums2[i])!=null &&hm1.get(nums2[i])!=0){
                al.add(nums2[i]);
                hm1.put(nums2[i], hm1.get(nums2[i])-1);
            }
        }
        int[] res = new int[al.size()];
        for(int i=0;i<res.length;i++)
            res[i] = al.get(i);
        return res;
    }
}