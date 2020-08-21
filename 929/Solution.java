class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<emails.length;i++){
            StringBuilder sb = new StringBuilder();
            boolean fp = false;
            for(int j=0;j<emails[i].length();j++){
                char temp =emails[i].charAt(j);
                if(temp == '.')continue;
                if(temp == '+')fp = true;
                if(temp == '@'){
                    sb.append(emails[i].substring(j,emails[i].length()));
                    break;
                }
                if(!fp) sb.append(temp);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}