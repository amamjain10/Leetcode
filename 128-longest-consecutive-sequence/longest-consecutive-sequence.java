class Solution {
    public int longestConsecutive(int[] nums) {
          HashSet<Integer> set = new HashSet<>();

        // Add all elements into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {

            // Check if num is the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Count consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}