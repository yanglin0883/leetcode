class Solution {
    public int balancedString(String s) {
        char str[] = s.toCharArray();
        int max = str.length/4, min = str.length, pre =-1;
        for(int i=0;i<str.length;i++){
            int left=0, right=str.length-1, q=0, w=0, e=0, r=0;
            T:while(left<i){
                    switch(str[left]){
                        case 'Q':
                            if(q+1>max) break T;
                            q++;left++;
                            break;
                        case 'W':
                            if(w+1>max) break T;
                            w++;left++;
                            break;
                        case 'E':
                            if(e+1>max) break T;
                            e++;left++;
                            break;
                        case 'R':
                            if(r+1>max) break T;
                            r++;left++;
                            break;
                    }
                
            } 
            if(left==pre) break;
            pre = left;
            T:while(left<=right){
                switch(str[right]){
                    case 'Q':
                        if(q+1>max) break T;
                        q++;right--;
                        break;
                    case 'W':
                        if(w+1>max) break T;
                        w++;right--;
                        break;
                    case 'E':
                        if(e+1>max) break T;
                        e++;right--;
                        break;
                    case 'R':
                        if(r+1>max) break T;
                        r++;right--;
                        break;
                }
            }
            min = Math.min(min, right-left+1);
            //System.out.println(min+"  "+left+"  "+right);
        }
        return min;
    }
}