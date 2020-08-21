class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length<2) return words.length;
        String[] morse = new String[words.length];
        for(int i=0;i<words.length;i++){
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                temp.append(transfer(words[i].charAt(j)));
            }
            morse[i] = temp.toString();
        }
        HashSet<String> hs = new HashSet();
        for(int i=0;i<morse.length;i++)
            hs.add(morse[i]);
        return hs.size();
    }
    
    private String transfer(char ch){
        switch(ch){
            case'a': return ".-";case'h': return "....";case'o': return "---";case'u': return "..-";
            case'b': return "-...";case'i': return "..";case'p': return ".--.";case'v': return "...-";
            case'c': return "-.-.";case'j': return ".---";case'q': return "--.-";case'w': return ".--";
            case'd': return "-..";case'k': return "-.-";case'r': return ".-.";case'x': return "-..-";
            case'e': return ".";case'l': return ".-..";case's': return "...";case'y': return "-.--";
            case'f': return "..-.";case'm': return "--";case't': return "-";case'z': return "--..";
            case'g': return "--.";case'n': return "-.";
        }
        return "";
    }
}