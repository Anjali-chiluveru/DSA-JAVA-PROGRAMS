class Solution {
    public String removeOuter(String s) {

        StringBuilder res = new StringBuilder();
        int balance = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // if not outermost '(' add it
                if (balance > 0) {
                    res.append(ch);
                }
                balance++;
            } 
            else {
                balance--;
                // if not outermost ')' add it
                if (balance > 0) {
                    res.append(ch);
                }
            }
        }

        return res.toString();
    }
}
