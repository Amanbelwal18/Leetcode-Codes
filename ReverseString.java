/*Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
 
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 
Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.
*/

public class ReverseString {
    public void reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ReverseString RS = new ReverseString();
        char[] str = {'h','e','l','l','o'};
        RS.reverseString(str);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

}
