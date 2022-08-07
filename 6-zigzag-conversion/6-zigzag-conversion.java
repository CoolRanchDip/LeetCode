class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; //Base case
        
        String[] nestedStrings = new String[numRows];
        int pointer = 0;
        int sPtr = 0;
        int inc = 1;
        while (sPtr < s.length()) {
            Character curChar = s.charAt(sPtr);
            if (nestedStrings[pointer] == null) {
                nestedStrings[pointer] = "";
            }
            nestedStrings[pointer] += curChar;
            sPtr++;
            pointer += inc;
            if (pointer == numRows || pointer < 0) {
                inc *= -1;
                pointer += 2*inc;
            }
        }
        String result = "";
        for (String curString : nestedStrings) {
            if (curString != null) {
                result += curString;                
            }
        }
        return result;        
    }
}