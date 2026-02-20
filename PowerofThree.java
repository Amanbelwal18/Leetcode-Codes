public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        PowerofThree PT = new PowerofThree();
        int n1 = 27;
        int n2 = 0;
        int n3 = 9;
        System.out.println(PT.isPowerOfThree(n1));
        System.out.println(PT.isPowerOfThree(n2));
        System.out.println(PT.isPowerOfThree(n3));
    }
    
}
