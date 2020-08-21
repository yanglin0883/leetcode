class Solution {
    public String defangIPaddr(String address) {
        String words[] = address.split("\\.");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<3;i++){
            res.append(words[i]);
            res.append("[.]");
        }
        res.append(words[3]);
        return res.toString();
    }
}