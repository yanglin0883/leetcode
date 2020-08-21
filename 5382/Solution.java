class Solution {
    public String entityParser(String text) {
        StringBuilder res = new StringBuilder();
        char[] t = text.toCharArray();
        for(int i=0;i<t.length;i++){
            if(t[i]!='&') res.append(t[i]);
            else{
                if(i+5<t.length &&"quot;".equals(new String(t, i+1, 5))){
                    i+=5;
                    res.append('"');
                }
                else if(i+3<t.length&& "gt;".equals(new String(t, i+1, 3))){
                    i+=3;
                    res.append('>');
                }else if(i+3<t.length&& "lt;".equals(new String(t, i+1, 3))){
                    i+=3;
                    res.append('<');
                }else if(i+6<t.length && "frasl;".equals(new String(t, i+1, 6))){
                    i+=6;
                    res.append('/');
                }else if(i+5<t.length && "apos;".equals(new String(t, i+1, 5))){
                    i+=5;
                    res.append('\'');                              
                }else if(i+4<t.length && "amp;".equals(new String(t, i+1,4))){
                    i+=4;
                    res.append('&');
                }else res.append(t[i]);
            }
        }
        return res.toString();
    }
}