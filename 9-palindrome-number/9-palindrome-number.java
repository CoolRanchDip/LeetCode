class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x >= 0  && x < 10) return true;
        LinkedList<Integer> mainList = new LinkedList<Integer>();
        while (x != 0) {
            mainList.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < mainList.size() / 2; i++) {
            if (mainList.get(i) != mainList.get(mainList.size() - 1 - i))
                return false;
        }
        return true;        
    }
}