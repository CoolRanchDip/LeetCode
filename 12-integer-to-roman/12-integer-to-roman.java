class Solution {
    public String intToRoman(int num) {
        String temp = "";
        while (num >= 1000) {
            temp += "M";
            num -= 1000;
        }
        while (num >= 900) {
            temp += "CM";
            num -= 900;
        }
        while (num >= 500) {
            temp += "D";
            num -= 500;
        }
        while (num >= 400) {
            temp += "CD";
            num -= 400;
        }
        while (num >= 100) {
            temp += "C";
            num -= 100;
        }
        while (num >= 90) {
            temp += "XC";
            num -= 90;
        }
        while (num >= 50) {
            temp += "L";
            num -= 50;
        }
        while (num >= 40) {
            temp += "XL";
            num -= 40;
        }
        while (num >= 10) {
            temp += "X";
            num -= 10;
        }
        while (num >= 9) {
            temp += "IX";
            num -= 9;
        }
        while (num >= 5) {
            temp += "V";
            num -= 5;
        }
        while (num >= 4) {
            temp += "IV";
            num -= 4;
        }
        while (num >= 1) {
            temp += "I";
            num -= 1;
        }
        
        return temp;             
    }
}