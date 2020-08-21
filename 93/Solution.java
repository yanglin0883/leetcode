class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if(s==null||s.length()<4)return res;
        dfs(res, s, 0, new ArrayList<Integer>());
        return res;
    }
    void dfs(List<String> res, String s, int start, ArrayList<Integer>path){
        if(start==s.length() && path.size()==4) res.add(getString(path));
        if(path.size()>=4 || start>=s.length()) return;
        for(int i=1;i<=3&&start+i<=s.length();i++){
            Integer temp = new Integer(s.substring(start, start+i));
            if(temp>255||s.charAt(start)=='0'&&i!=1)continue;
            path.add(temp);
            dfs(res, s, start+i, path);
            path.remove(path.size()-1);
        }
    }
    
    String getString(ArrayList<Integer> path){
        StringBuilder sb = new StringBuilder();
        for(Integer i: path){
            sb.append(i);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}