class Solution {
    public String reformat(String s) {
        if(s.length()<2) return s;
        ArrayList<Character> letters = new ArrayList();
        ArrayList<Character> nums = new ArrayList();
        for(char c: s.toCharArray()){
            if(c>='0'&&c<='9') nums.add(c);
            else letters.add(c);
        }
        if(letters.size()>nums.size()+1) return "";
        if(letters.size()+1<nums.size()) return "";
        StringBuilder sb = new StringBuilder();
        if(letters.size()>nums.size()){
            for(int i=0;i<nums.size();i++){
                sb.append(letters.get(i));
                sb.append(nums.get(i));
            }
            sb.append(letters.get(letters.size()-1));
        }else{
            for(int i=0;i<letters.size();i++){
                sb.append(nums.get(i));
                sb.append(letters.get(i));
            }
            if(nums.size()>letters.size())sb.append(nums.get(nums.size()-1));
        }
        return sb.toString();
    }
}