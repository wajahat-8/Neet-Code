package arrays_hashing;

public class ConcatenationOfArrays {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] result=new int[n*2];
        for(int i=0;i<n;i++){
            result[i]=nums[i];
            result[i+n]=nums[i];
        }
        return  result;
    }

    public static void main(String[] args) {
        ConcatenationOfArrays obj = new ConcatenationOfArrays();
        int[] result = obj.getConcatenation(new int[]{1, 2,3, 1});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
