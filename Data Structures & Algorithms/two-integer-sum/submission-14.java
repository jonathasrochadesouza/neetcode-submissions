class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int main = 0; main < nums.length; main++) {
            for (int now = main + 1; now < nums.length; now++) {
                int value_main = nums[main];
                int value_now = nums[now];
                int total = value_main + value_now;

                if (total == target) {
                    return new int[]{main, now};
                }
            }
        }

        return new int[]{};
    }

}
