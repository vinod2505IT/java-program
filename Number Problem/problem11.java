/*
Spy Number Program in Java
A spy number is a number where the sum of its digits equals the product of its digits. For example, 1124 is a spy number, the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
*/

import java.util.Scanner;

public class problem11 {
    public static void isSpyNumber(int num){
        int sum = 0;
        int product = 1;
        while(num!=0){
            int temp = num%10;
            sum+=temp;
            product*=temp;
            num/=10;
        }
        if(sum == product){
            System.out.println("it is spy number");
        }else{
            System.out.println("It is not spy number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isSpyNumber(num);
        in.close();

    }
}
