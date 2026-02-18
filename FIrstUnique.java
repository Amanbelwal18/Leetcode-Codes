/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
*/

public class FIrstUnique {
    public int firstUniqChar(String s) {
        int flag=-1;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            boolean duplicate=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if (duplicate!=true) {
                flag = i;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        FIrstUnique FU = new FIrstUnique();
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        System.out.println(FU.firstUniqChar(s1));
        System.out.println(FU.firstUniqChar(s2));
        System.out.println(FU.firstUniqChar(s3));
    }
    
}
