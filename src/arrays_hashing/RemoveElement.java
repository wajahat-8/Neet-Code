package arrays_hashing;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int newLength = re.removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
