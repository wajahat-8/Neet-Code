package arrays_hashing;

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(nums));

        sc.sortColors(nums);

        System.out.println("After sorting: " + Arrays.toString(nums));
    }
}
