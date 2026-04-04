class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;
        
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder result = new StringBuilder();
        
        for (int j = 0; j < cols; j++) {
            int i = 0, k = j;
            while (i < rows && k < cols) {
                result.append(encodedText.charAt(i * cols + k));
                i++;
                k++;
            }
        }
        
        int end = result.length();
        while (end > 0 && result.charAt(end - 1) == ' ') end--;
        
        return result.substring(0, end);
    }
}