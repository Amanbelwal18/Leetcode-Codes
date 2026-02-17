public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                
                // Find next non-zero element
                while (j < n && nums[j] == 0) {
                    j++;
                }
                
                // If found, swap
                if (j < n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        for (int a=0;a<nums.length;a++){
            System.out.print(nums[a] + " ");
        }
    }
}
