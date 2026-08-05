class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> arr= new ArrayList<Integer> ();
        
        if(nums.length == 0) return arr;
        
        int max = nums[0], min = nums[0]; 
        for(int num : nums)
        {
            if(max < num) max = num;
            if(min > num) min = num;
        }
        
        for(int i = min; i<max+1; i++)
        {
            arr.add(i);
        }
        
        for(int n : nums)
          arr.remove(Integer.valueOf(n));
        
        return arr;
         
    }
}
