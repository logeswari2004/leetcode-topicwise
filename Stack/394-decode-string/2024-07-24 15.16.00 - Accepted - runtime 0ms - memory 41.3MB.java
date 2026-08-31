class Solution {
    int i=0;
    public String decodeString(String s) {
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        int count=0;
        String temp="";
        while(i<n){
            char c=s.charAt(i);
            i++;
            if(c=='['){
                temp=decodeString(s);
                for(int j=0;j<count;j++){
                    sb.append(temp);
                }
                count=0;
            }else if(c==']'){
                break;
            }else if(Character.isAlphabetic(c)){
                sb.append(c);
            }else{
                count=count*10+c-'0';
            }
        }
        return sb.toString();
    }
}