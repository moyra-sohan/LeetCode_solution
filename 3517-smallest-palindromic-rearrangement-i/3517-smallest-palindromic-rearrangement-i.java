class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int mid = s.length()/2;
        if(s.length()==1)
            return s;
        
        char arr [] = s.toCharArray();

        Arrays.sort(arr, 0, mid);
        for(int i=0; i<mid; i++){
            arr[n-1-i] = arr[i];
        }

        return new String(arr);

    }
}