class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        int minLen = strs[0].length();
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        
        char[] prefixChars = new char[minLen];
        int prefixLength = 0;
        
        for (int j = 0; j < minLen; j++) {
            char currentChar = strs[0].charAt(j);
            
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != currentChar) {
                    return new String(prefixChars, 0, prefixLength);
                }
            }
            prefixChars[prefixLength++] = currentChar;
        }
        
        return new String(prefixChars, 0, prefixLength);
    }
}
