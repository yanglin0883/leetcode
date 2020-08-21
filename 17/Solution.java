class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits==null||digits.length()==0) return res;
        HashMap<Character, String>hm = getMapping();
        dfs(0, digits, new StringBuilder(), res,hm);
        return res;
    }
    void dfs(int index, String digits, StringBuilder current, List<String>res,HashMap<Character, String>hm){
        if(index==digits.length()){
            res.add(current.toString());
            return;
        }
        int len = current.length();
        for(char c:hm.get(digits.charAt(index)).toCharArray()){
            current.append(c);
            dfs(index+1, digits,current, res, hm);
            current.deleteCharAt(len);
        }
    }
    HashMap<Character, String> getMapping(){
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        return hm;
    }
}