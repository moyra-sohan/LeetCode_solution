class Solution {
    public int findGCD(int[] nums) {
        int mx = nums[0], mn = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(mn > nums[i]){ 
                mn = nums[i];  
            }
            if(mx < nums[i]){
                mx = nums[i];
            }
        }
        while(mn != 0){
            int temp = mn;
            mn = mx % mn;
            mx = temp;
        }
        return mx;
    }
}