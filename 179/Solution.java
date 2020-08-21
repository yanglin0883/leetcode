class Solution {
    public String largestNumber(int[] nums) {
        String[] n = new String[nums.length];
        for(int i=0;i<nums.length;i++)n[i] = Integer.toString(nums[i]);
        Arrays.sort(n, (s2, s1)->{
            return (s1+s2).compareTo(s2+s1);
        });
        StringBuilder sb = new StringBuilder();
        for(String i:n){
            sb.append(i);
        }
        while(sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);
        return sb.toString();
    }
}