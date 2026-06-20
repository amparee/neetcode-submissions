class Solution {
    public boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> queue = new Stack<Character>();

        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                queue.push(c);
                continue;
            }
            if (queue.isEmpty()) 
                return false;

            Character last = queue.peek();
            if ((c == ')' && last == '(')
                || (c == '}' && last == '{')
                || (c == ']' && last == '[') ) {
                    queue.pop();
                } else {
                    return false;
                }


        }


        if (queue.isEmpty()) 
            return true;
        return false;
    }
}
