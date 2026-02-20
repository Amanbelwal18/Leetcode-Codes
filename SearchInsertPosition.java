/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length; 
    }
    public static void main(String[] args) {
        SearchInsertPosition SIP = new SearchInsertPosition();
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        System.out.println(SIP.searchInsert(nums1, target1));
        System.out.println(SIP.searchInsert(nums1, target2));
        System.out.println(SIP.searchInsert(nums1, target3));
    }
    
}
