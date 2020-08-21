class Solution {
    public String[] getFolderNames(String[] names) {
        String[] res= new String[names.length];
        Set<String> used = new HashSet();
        for(int i=0;i<names.length;i++){
            if(!used.contains(names[i])){
                used.add(names[i]);
                res[i] = names[i];
            }else{
                for(Integer j=1;j<50001;j++){
                    String temp = names[i]+"("+j.toString()+")";
                    if(!used.contains(temp)){
                        used.add(temp);
                        res[i] = temp;
                        break;
                    }
                }
            }
        }
        return res;
    }
}