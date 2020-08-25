//Longest Common prefix probleem 
class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
       Arrays.sort(strs);
        int size = strs.length;
        int i=0;
        int min = Math.min(strs[0].length(),strs[size-1].length());
        while(i<min && strs[0].charAt(i) == strs[size-1].charAt(i)){
            i++;
        }
        String res = strs[0].substring(0,i);
        return res;
    }
}
