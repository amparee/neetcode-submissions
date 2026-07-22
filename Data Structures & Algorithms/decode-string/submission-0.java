class Solution {
    public String decodeString(String s) {
        Stack<String> stackString = new Stack<String>();
        Stack<Integer> stackInteger = new Stack<Integer>();
        StringBuilder currentStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; 
                stackInteger.push(num);
            } else if (c == '[') {
                stackString.push(currentStr.toString());
                currentStr = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(stackString.pop());
                int repeatTimes = stackInteger.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(currentStr);
                }
                currentStr = temp;
            } else {
                currentStr.append(c);
            }
            
         
        }
           return currentStr.toString();
    }
}