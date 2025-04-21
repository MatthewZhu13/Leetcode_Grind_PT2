class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp_stack = new Stack<>();
        int[] days = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!temp_stack.isEmpty() && (temperatures[i] > temperatures[temp_stack.peek()])) {
                int idx = temp_stack.pop();
                days[idx] = i - idx;
            }
            temp_stack.push(i);
        }
        return days;
    }
}
