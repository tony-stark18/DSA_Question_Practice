class Solution {
    String longestCommonPrefix(String arr[], int n) {
        
        String prefix = arr[0];  // Assume the first string as the initial prefix
        
        for (int i = 1; i < n; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);  // Reduce the prefix by one character
                if (prefix.isEmpty()) {
                    return "-1";  // If prefix becomes empty, it should return -1
                }
            }
        }
        
        return prefix;
    }
}
