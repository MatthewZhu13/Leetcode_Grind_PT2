
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> both = new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            double time = (target - position[i]) /  (double) speed[i];
            both.put(position[i], time);
        }

        Stack<Integer> carSpeed = new Stack<>();
        Arrays.sort(position);

        for (int i = position.length - 1; i > -1; i--) {
            if (carSpeed.empty()) {
                carSpeed.push(position[i]);
            }
            else if (both.get(carSpeed.peek()) < both.get(position[i])) {
                carSpeed.push(position[i]);
            }
        }
        return carSpeed.size();

    }
}
