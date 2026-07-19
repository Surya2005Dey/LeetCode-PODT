class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26]; 
        boolean[] visited = new boolean[26]; 
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            freq[c - 'a']--; 

            if (visited[c - 'a']) continue; 
            // while stack not empty and current char is smaller than last char
            // and last char will appear again later → pop
            while (stack.length() > 0 &&
                   c < stack.charAt(stack.length() - 1) &&
                   freq[stack.charAt(stack.length() - 1) - 'a'] > 0) {
                visited[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            stack.append(c);
            visited[c - 'a'] = true;
        }

        return stack.toString();
    }
}
//done