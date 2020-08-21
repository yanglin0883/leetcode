class Solution {
    public String strWithout3a3b(int A, int B) {
        if(A>B) return string(A, 'a', B, 'b');
        else return string(B, 'b', A, 'a');
    }
    private String string(int n1, char c1, int n2, char c2){
        StringBuilder sb = new StringBuilder();
        while(n1>0&&n2>0&&n1!=n2){
            sb.append(c1);
            sb.append(c1);
            n1-=2;
            sb.append(c2);
            n2--;
        }
        while(n1>0&&n2>0){
            sb.append(c1);
            sb.append(c2);
            n1--;
            n2--;
        }
        while(n1>0){
            sb.append(c1);n1--;
        }
        while(n2>0){
            sb.append(c2);n2--;
        }
        return sb.toString();
    }
}