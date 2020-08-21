class Solution {
    public String simplifyPath(String path) {
        String[] levels = path.split("/+");
        Stack<String> temp = new Stack<>();
        for(int i=0;i<levels.length;i++){
            // System.out.println(levels[i]);
            if(levels[i].equals(".")||levels[i].equals("")) continue;
            if(levels[i].equals("..")) {
                if(!temp.empty()) temp.pop();
            }
            else temp.push(levels[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<temp.size();i++){
            // System.out.println(" aa "+temp.get(i)+" bb ");
            sb.append('/');
            sb.append(temp.get(i));
        }
        if(sb.length()==0) return "/";
        return sb.toString();
    }
}