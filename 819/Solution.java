class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if(paragraph==null || paragraph.length()==0) return "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<paragraph.length();i++){
            while(i<paragraph.length()&&!Character.isLetter(paragraph.charAt(i)))
                i++;
            int j=i;
            for(;j<paragraph.length()&&Character.isLetter(paragraph.charAt(j));j++);
            String temp = paragraph.substring(i, j).toLowerCase();
            hm.put(temp, hm.getOrDefault(temp, 0)+1);
            i=j;
        }
        for(int i=0;i<banned.length;i++){
            hm.remove(banned[i].toLowerCase());            
        }
        String max=null;
        for(String i : hm.keySet()){
            if(max==null || hm.get(max)<hm.get(i)) max = i;
        }
        return  max;
    }
}