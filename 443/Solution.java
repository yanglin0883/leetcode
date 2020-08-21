class Solution {
    public int compress(char[] chars) {
        int read=0, output=0;
        while(read<chars.length){
            int duplicate = read+1;
            while(duplicate<chars.length&&chars[read]==chars[duplicate])duplicate++;
            if(duplicate - read>1){
                chars[output++] = chars[read];
                for(char temp: new Integer(duplicate-read).toString().toCharArray())
                    chars[output++] = temp;
            }
            else {
                chars[output++] = chars[read];
            }
            read = duplicate;
        }
        return output;
    }
}