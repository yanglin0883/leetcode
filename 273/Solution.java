class Solution {
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String n = Integer.toString(num);
        List<String> groups = group(n);
        String[] labels = {"", "Thousand","Million","Billion"};
        StringBuilder res = new StringBuilder();
        for(int i=groups.size()-1;i>-1;i--){
            if(groups.get(i)==null)continue;
            res.append(groups.get(i));
            res.append(" ");
            if(i!=0){
                res.append(labels[i]);
                res.append(" ");
            }
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
    
    List<String> group(String n){
        List<String> res = new ArrayList();
        for(int i=n.length();i>0;i-=3){
            res.add(n.substring(i>=3?i-3:0, i));
        }
        return toWord(res);
    }
    String[] nums = {"","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    List<String> toWord(List<String> n){
        List<String> res = new ArrayList();
        for(String i: n){
            if(i.length()==1){
                if(i.charAt(0)=='0'){
                    res.add(null);
                    continue;
                }
                res.add(nums[i.charAt(0)-'0']);
            }
            else if(i.length()==2){
                if(i.equals("00")){
                    res.add(null);
                    continue;
                }
                if(i.charAt(0)=='0'){
                    res.add(nums[i.charAt(1)-'0']);
                    continue;
                }
                res.add(get2Digit(i));
            }
            else{
                if(i.charAt(0)=='0'){
                    if(i.charAt(1)=='0'){
                        if(i.charAt(2)=='0')
                            res.add(null);
                        else res.add(nums[i.charAt(2)-'0']);
                    }
                    else res.add(get2Digit(i.substring(1,3)));
                }
                else {
                    StringBuilder temp = new StringBuilder();
                    temp.append(nums[i.charAt(0)-'0']);
                    temp.append(" Hundred");
                    if(!i.substring(1, 3).equals("00")){
                        temp.append(" ");
                        if(i.charAt(1)=='0'){
                            temp.append(nums[i.charAt(2)-'0']);
                        }
                        else{
                            temp.append(get2Digit(i.substring(1,3)));
                        }
                    }
                    res.add(temp.toString());
                }
            }
        }
        return res;
    }
    String[] tens = {"Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen", "Eighteen","Nineteen"};
    String[] digits={"","","Twenty","Thirty","Forty","Fifty", "Sixty","Seventy","Eighty","Ninety"};
    String get2Digit(String n){
        if(n.charAt(0)=='0'){
            if(n.charAt(1)=='0') return null;
            else return nums[n.charAt(1)-'0'];
        }
        if(n.charAt(0)=='1'){
            return tens[n.charAt(1)-'0'];
        }
        StringBuilder res = new StringBuilder();
        res.append(digits[n.charAt(0)-'0']);
        if(n.charAt(1)!='0'){
            res.append(" ");
            res.append(nums[n.charAt(1)-'0']);
        }
        return res.toString();
    }
}