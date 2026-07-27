class Solution {
    public int maxProduct(int[] nums) {
        int Secondbig = 0, bigNum = 0;

        for(int num : nums){
            if(num > bigNum)
            {
                Secondbig = bigNum;
                bigNum = num; 
            }else{
                Secondbig = Math.max(Secondbig, num);
            }
        }
        return (bigNum-1)*(Secondbig-1);
    }
}