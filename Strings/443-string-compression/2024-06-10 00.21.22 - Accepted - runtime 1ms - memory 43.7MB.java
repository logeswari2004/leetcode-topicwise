class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            char c = chars[i];
            int count = 1;
            while(i+1 < n && c == chars[i+1]){
                i++;
                count++;
            }
            str.append(c);
            if(count>1){
                str.append(count);
            }
        }
        char[] res = str.toString().toCharArray();
        for(int i=0;i<res.length;i++){
            chars[i] = res[i];
        }
        return res.length;
    }
}