class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        String prefix = strs[0];
        for (int i = 0 ; i < strs.length ; i++){
            prefix = commonprefix(prefix, strs[i]);
            if (prefix.equals("")) return "";
        }
        return prefix;
    }
    public static String commonprefix(String s1 , String s2){
        int minlength = Math.min(s1.length(), s2.length());
        int i = 0;
        while(i < minlength  && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println("logest common prefix would be: "+ longestCommonPrefix(strs));
    }
}