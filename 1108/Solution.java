class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        for(int i=0;i<address.length();i++){
            char temp = address.charAt(i);
            if(temp == '.') 
                res += "[.]";
            else res += temp;
        }
        return res;
    }
}