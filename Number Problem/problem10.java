/*
!Leetcode problem;
Reverse Integer(Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231,
231 - 1], then return 0. Assume the environment does not allow you to store 64-
bit integers (signed or unsigned)).
 */
import java.util.Scanner;

public class problem10 {
    public static int isrevIsInteger(int input){
        long rev = 0;
        while(input != 0){
            if(rev <= Integer.MAX_VALUE){
                rev = (input%10)+(rev * 10);
            }else{
                break;
            }
            input/=10;
        }
        
        if(rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE){
            return (int)rev;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int output = isrevIsInteger(input);
        System.out.println(output);
        in.close();
    }
}
