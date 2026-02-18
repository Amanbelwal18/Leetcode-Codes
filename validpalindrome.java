public class validpalindrome {
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }       
    public static void main(String[] args) {
        validpalindrome VP = new validpalindrome();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "OP";
        System.out.println(VP.isPalindrome(s1));
        System.out.println(VP.isPalindrome(s2));
        System.out.println(VP.isPalindrome(s3));
    }
}
