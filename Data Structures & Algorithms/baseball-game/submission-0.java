class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("+")) {
                int top = stack.pop();
                int second = stack.peek();
                stack.push(top);
                stack.push(top + second);
            } else if (op.equals("D")) {
                stack.push(stack.peek()*2);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}