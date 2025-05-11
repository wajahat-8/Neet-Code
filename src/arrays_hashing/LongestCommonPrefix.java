package arrays_hashing;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }

        char[][] charArray = new char[strs.length][];
        for (int i = 0; i < strs.length; i++){
            charArray[i] = strs[i].toCharArray();
        }

        int minLength = Integer.MAX_VALUE;
        for (String s : strs){
            minLength = Math.min(minLength, s.length());
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLength; i++){
            char currentChar = charArray[0][i];
            for (int j = 1; j < strs.length; j++){
                if (charArray[j][i] != currentChar){
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] testInput = {"flower", "flow", "flight"};
        String result = lcp.longestCommonPrefix(testInput);
        System.out.println("Longest common prefix: " + result);
    }
}
