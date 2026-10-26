class Solution {
    public String addBinary(String a, String b) {
        // Use StringBuilder to efficiently build the resulting binary string
        StringBuilder result = new StringBuilder();
        
        // Initialize pointers at the end of both strings (least significant bits)
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        // Track the carry-over value during addition
        int carry = 0;
        
        // Loop until both strings are fully traversed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Start with the carry from the previous step
            
            // Add the bit from string 'a' if available, then move pointer left
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Subtract '0' to convert char to int
                i--;
            }
            
            // Add the bit from string 'b' if available, then move pointer left
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Subtract '0' to convert char to int
                j--;
            }
            
            // Append the current bit to the result (sum % 2 gives 0 or 1)
            result.append(sum % 2);
            
            // Update the carry for the next position (sum / 2 gives 1 if sum >= 2, else 0)
            carry = sum / 2;
        }
        
        // Since bits were appended from right to left, reverse the string and return
        return result.reverse().toString();
    }
}