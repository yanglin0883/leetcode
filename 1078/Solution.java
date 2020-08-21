class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split("\\s+");
        ArrayList<String> res = new ArrayList<>();
        for(int i=2;i<words.length;i++){
            if(words[i-2].equals(first) &&words[i-1].equals(second))
                res.add(words[i]);
        }
        return res.toArray(new String[0]);
    }
}