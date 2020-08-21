class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<address.length();i++){
            char temp = address.charAt(i);
            if(temp == '.') 
                res.append("[.]");
            else res.append(temp);
        }
        return res.toString();
    }
}