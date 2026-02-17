/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < n && nums[j] == 0) {
                    j++;
                }
                if (j < n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        MoveZeros MZ = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        MZ.moveZeroes(nums);
        for (int a=0;a<nums.length;a++){
            System.out.print(nums[a] + " ");
        }
    }
}
