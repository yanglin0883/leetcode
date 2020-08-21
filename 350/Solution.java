
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            hm1.put(nums1[i], hm1.getOrDefault(nums1[i],0)+1);
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
            hm2.put(nums2[i], hm2.getOrDefault(nums2[i],0)+1);
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer i: hm1.keySet()){
            if(hm2.containsKey(i)){
                int min = Math.min(hm1.get(i), hm2.get(i));
                for(int j=0;j<min;j++)
                    al.add(i);
            }
        }
        int[] res = new int[al.size()];
        for(int i=0;i<res.length;i++)
            res[i] = al.get(i);
        return res;
    }
}