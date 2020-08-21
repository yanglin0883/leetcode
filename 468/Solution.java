class Solution {
    public String validIPAddress(String IP) {
        if(IP==null||IP.length()<4) return "Neither";
        if(!IP.contains(":")){
            //System.out.println("v4");
            if(IP.charAt(0)=='.' || IP.charAt(IP.length()-1)=='.') return "Neither";
            String[] v4 = IP.split("\\.");
            if(v4.length!=4) return"Neither";
            // for(int i=0;i<v4.length;i++)
            //     System.out.println(v4[i]);
            for(int i=0;i<4;i++){
                //System.out.println(v4[i]);
                if(v4[i]==null||v4[i].length()<1||v4[i].charAt(0)=='-'
                   ||v4[i].charAt(0)=='0'&&v4[i].length()>1) return"Neither";
                int j;
                try{
                    j = Integer.parseInt(v4[i]);
                }
                catch(Exception e){
                    return"Neither";
                }
                if(j<0||j>255) return"Neither"; 
            }
            return "IPv4";
        }else {
            if(IP.charAt(0)==':'||IP.charAt(IP.length()-1)==':') return"Neither";
            String[] v6 = IP.split(":");
            if(v6.length!=8) return"Neither";
            // System.out.println("v6"+v6.length);
            for(int i=0;i<8;i++){
                // System.out.println("  "+v6[i]);
                if(v6[i]==null||v6[i].length()<1
                   ||v6[i].charAt(0)=='-'||v6[i].length()>4) return"Neither";
                int j;
                try{
                    j = Integer.parseInt(v6[i],16);
                }
                catch(Exception e){
                    return"Neither";
                }
                if(j<0) return"Neither"; 
            }
            return "IPv6";
        }
    }
}