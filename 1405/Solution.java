class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int[][] nums = {{a,0}, {b,1}, {c,2}};
        Arrays.sort(nums, (p1,p2)->p1[0]-p2[0]);                        
        if(nums[2][0]>(nums[0][0] + nums[1][0] + 1)*2)
            nums[2][0] = (nums[0][0] + nums[1][0] + 1)*2;
        // System.out.println(nums[0][0]+"  "+nums[1][0]+"  "+nums[2][0]);
        StringBuilder res = new StringBuilder();
        if(nums[2][0]<=nums[0][0]+nums[1][0]){
            int i=0;
            for(i=0;i<nums[0][0];i++){
                res.append((char)(nums[0][1]+'a'));
                res.append((char)(nums[1][1]+'a'));
                res.append((char)(nums[2][1]+'a'));
            }
            for(;i<nums[1][0];i++){                
                res.append((char)(nums[1][1]+'a'));
                res.append((char)(nums[2][1]+'a'));
            }
            char temp = (char)(nums[2][1]+'a');
            for(int j=res.length()-1;j>-1;j--){
                if(i==nums[2][0])break;
                if(res.charAt(j)==temp){
                    res.insert(j, temp);
                    i++;
                }
            }
        }
        else {
            int i=0;
            for(i=0;i<nums[0][0];i++){
                res.append((char)(nums[0][1]+'a'));
                res.append((char)(nums[2][1]+'a'));                
            }
            // System.out.println(nums[0][0]+"  "+i);
            for(;i<nums[1][0]+nums[0][0];i++){
                res.append((char)(nums[1][1]+'a'));
                res.append((char)(nums[2][1]+'a'));                
            }
            // System.out.println(nums[1][0]+"  "+i);
            char temp = (char)(nums[2][1]+'a');
            for(int j=res.length()-1;j>-1;j--){
                if(i==nums[2][0])break;
                if(res.charAt(j)==temp){
                    res.insert(j, temp);
                    i++;
                }
            }
            // System.out.println(nums[2][0]+"  "+i);
            for(;i<nums[2][0];i++)
                res.insert(0, temp);
            
        }
        return res.toString();
    }
}