class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x *= -1;
        }
        String returnInt = "";
        while (x > 0 || x < 0) {
            returnInt += x % 10;
            x /= 10;
        }
        try {
            x = Integer.parseInt(returnInt); 
        }
        catch(Exception e) {
            return 0;
        }
        if (isNeg)
            x *= -1;
        return x; 
    }
}