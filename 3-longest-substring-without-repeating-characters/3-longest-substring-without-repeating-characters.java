class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length(); //If 0 or 1 letter
        HashMap<Character, Integer> uniqueLtrs = new HashMap<>();
        int start = 0;
        int maxLength = -1;
        int length = 0;
        for (int end = 0; end < s.length(); end++) {
            Character curLtr = s.charAt(end);
            //If found dupe
            if (uniqueLtrs.containsKey(curLtr)) {
                if (length > maxLength) { maxLength = length;}
                //New start is old dupe index + 1 if greater than start
                if (uniqueLtrs.get(curLtr)+1 > start) {
                    start = uniqueLtrs.get(curLtr)+1;
                }
                //Update index and length
                uniqueLtrs.put(curLtr, end);
                length = end - start;
            }
            else {
                uniqueLtrs.put(curLtr, end); //Store it with idx    
            }
            length++;         
        }
        if (length > maxLength) return length;
        return maxLength;
    }
}