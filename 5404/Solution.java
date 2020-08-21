class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList();
        int pre=0;
        for(int i=0;i<target.length;i++){            
            for(int j=0;j<target[i]-pre;j++){
                res.add("Push");
                res.add("Pop");
            }
            res.remove(res.size()-1);
            pre = target[i];
        }
        return res;
    }
}