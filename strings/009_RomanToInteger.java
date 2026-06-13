class Solution {
    public int romanToDecimal(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = value(s.charAt(i));

            // check next value
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));

                if (curr < next) {
                    result -= curr;
                } else {
                    result += curr;
                }
            } else {
                result += curr;
            }
        }

        return result;
    }

    // helper function to get value of Roman symbol
    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
