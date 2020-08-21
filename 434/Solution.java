class Solution {
    public int countSegments(String s) {        
        String t = s.trim();
        if(t.equals("")) return 0;
        return t.split("\\s+").length;
    }
}
//正则表达式的妙用： \s 空白字符  + 一个或多个