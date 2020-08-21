class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A==null||B==null||A.length()!=B.length()||A.length()==0) return false;
        if(A.equals(B)) return check(A);
        ArrayList<Integer> dif = new ArrayList<>();
        for(int i=0;i<A.length();i++)
            if(A.charAt(i) != B.charAt(i)) dif.add(i);
        if(dif.size()!=2) return false;
        if(A.charAt(dif.get(0)) == B.charAt(dif.get(1)) && A.charAt(dif.get(1)) == B.charAt(dif.get(0))) return true;
        else return false;
    }
    boolean check(String s){
        if(s.length()>26) return true;
        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<s.length();j++)
                if(s.charAt(i) == s.charAt(j)) return true;
        return false;
    }
}