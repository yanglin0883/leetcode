class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> r1 = new ArrayList<>(), r2 = new ArrayList<>();
        for(String i: logs){
            int j =0;
            for(;j<i.length()&&i.charAt(j)!=' ';j++);
            char ch = i.charAt(j+1);
            if(ch>='0'&&ch<='9'){
                r2.add(i);
            }
            else{
                r1.add(i.substring(j, i.length()) +" "+ i.substring(0,j));
            }
        }
        Collections.sort(r1);
        String[] res = new String[logs.length];
        for(int i=0;i<r1.size();i++){
            String temp = r1.get(i);
            int j=temp.length()-1;
            for(;j>-1&&temp.charAt(j)!=' ';j--);
            //System.out.println("|"+temp+"|  "+ j);
            res[i] = temp.substring(j+1,temp.length()) + temp.substring(0,j);
        }
        for(int i=0;i<r2.size();i++){            
            res[i+r1.size()] = r2.get(i);
        }
        return res;
    }
}