class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean foundPrefix = false;
        String longestPrefix = "";
        String tempStr = "";
        int charIndex = 0;
        while (!foundPrefix) {
            if (strs[0].equals("")) return ""; //If empty string
            tempStr = strs[0].substring(0,charIndex+1); //Temp str increments by 1
            //Loop through array
            for (String curStr : strs) {
                //Check if every string has the prefix
                if (curStr.length() < tempStr.length() || !curStr.substring(0, charIndex+1).equals(tempStr)) { //Java uses short circuiting, so if 1st is false then done
                    return longestPrefix;
                }
            }
            longestPrefix = tempStr; //Set common prefix to the new value if done looping
            if (longestPrefix.equals(strs[0])) return longestPrefix; //If prefix is the whole word, return it
            charIndex++;
        }
        return longestPrefix;        
    }
}