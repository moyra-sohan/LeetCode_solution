class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop as long as there are digits to process or a carry remains
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            // Add digit from string 'a' if available
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Converts char '0' or '1' to int
                i--;
            }

            // Add digit from string 'b' if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the binary digit (0 or 1)
            res.append(sum % 2);

            // Calculate the new carry
            carry = sum / 2;
        }

        // The result is built backwards, so reverse it
        return res.reverse().toString();
    }
}
