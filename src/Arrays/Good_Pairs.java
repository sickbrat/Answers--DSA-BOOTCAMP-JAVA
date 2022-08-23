// Question --> https://leetcode.com/problems/number-of-good-pairs/

package Arrays;

public class Good_Pairs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };

        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int n = nums.length, count = 0;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (nums[i] == nums[j]) count++;

        return count;
    }
}
