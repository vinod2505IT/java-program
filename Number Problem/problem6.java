/*
A number is called Disarium number if the sum of its power of the positions from left to right is equal to the number.
Example: 11 + 32 + 53 = 1 + 9 + 125 = 135
*/

import java.util.Scanner;
public class problem6{
    public static void isDisariumNum(int num){

        String strnum1 = Integer.toString(num);
        int powOfnum1 = 0;

        for(int i=0; i<strnum1.length(); i++){
            double DoublepowOfnum1 = Math.pow(strnum1.charAt(i)-'0', i+1);
            powOfnum1 += (int) DoublepowOfnum1;
        }
            
        if(num == powOfnum1){
            System.out.println("It is disarium number");
        }else{
            System.out.println("It is not a disarium number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isDisariumNum(num);
        in.close();

    }
}