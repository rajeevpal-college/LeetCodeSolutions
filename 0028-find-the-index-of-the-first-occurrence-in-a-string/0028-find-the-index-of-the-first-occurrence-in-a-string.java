class Solution {
    public int strStr(String haystack, String needle) {
        // Loop sirf wahan tak chalega jahan tak needle fit ho sake
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            
            // Needle ke saare characters ek-ek karke match karo
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // Agar j badhte-badhte needle ki length ke barabar ho gaya, matlab poora word mil gaya!
            if (j == needle.length()) {
                return i; // Yahan se seedha answer return ho jayega (break ki zaroorat nahi)
            }
        }
        
        // Agar poore loop mein kahin match nahi mila
        return -1;
    }
}