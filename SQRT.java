/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned. 
*/

public class SQRT {
    public int mySqrt1(int x) {
        double ans=Math.sqrt(x);
        return (int)ans;
    }
    public int mySqrt2(int x) {
        if(x<2){
            return x;
        }
        long i=1;
        while(i*i<=x){
            i++;
        }
        return (int)(i-1);
    }

    public static void main(String[] args) {
        SQRT S = new SQRT();
        int x1 = 4;
        int x2 = 10;
        System.out.println(S.mySqrt1(x1));
        System.out.println(S.mySqrt2(x2));
    }
    
}
