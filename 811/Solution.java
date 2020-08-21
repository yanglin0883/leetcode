class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String temp : cpdomains){
            String a[] = temp.split(" ");
            for(int i=a[1].length()-1;i>=-1;i--){
                if(i==-1 || a[1].charAt(i)=='.'){
                    String str = a[1].substring(i+1, a[1].length());
                    hm.put(str, hm.getOrDefault(str,0) + new Integer(a[0]));
                }
            }
        }
        List<String> res = new ArrayList<>();
        for(String i : hm.keySet()){
            res.add(hm.get(i).toString() +" "+ i);
        }
        return res;
    }
}