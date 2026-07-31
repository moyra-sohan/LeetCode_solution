class Solution {
    public int hammingWeight(int n) {
        int temp = n, sum = 0;
        while(temp>0){
            sum += (temp%2);
            temp /= 2;
        }
        return sum;
    }
}