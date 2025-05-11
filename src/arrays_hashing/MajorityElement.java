package arrays_hashing;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 || nums[i] == current) {
                current = nums[i];
                count++;
            } else {
                count--;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        System.out.println("Majority element is: " + result);
    }
}
