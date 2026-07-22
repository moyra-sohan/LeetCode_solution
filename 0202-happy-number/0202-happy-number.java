class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedInt = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                sum += ((n % 10)*(n % 10));
                n = n / 10;
            }

            if (sum == 1) 
                return true;

            n = sum;

            if (usedInt.contains(n))
                return false;
            
            usedInt.add(n);
        }
    }
}