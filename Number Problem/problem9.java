/*
Tech Number Program(A tech number can be tech number if its digits are even
and the number of digits split into two number from middle then add these
number. if the added number’s square would be the same with the number it will
called a Tech Number. If the number is split in two equal halves, then the square
of sum of these halves is equal to the number itself. Write a program to generate
and print all four digits tech numbers. Note: If number of digits is not even then it
is not a tech number //TODO: EG: 2025 => 20+25 => 20^2 + 25^2 => 2025 so it is tech num.

*/
import java.util.Scanner;

public class problem9 {
    public static boolean isEvenLength(int numLength){
        if(numLength % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void isTechNumber(int num){
       String str = Integer.toString(num);
       int numLength = str.length();
       if(isEvenLength(numLength)){
           String substr1 = str.substring(0,(numLength/2));
           String substr2 = str.substring((numLength/2),numLength);
           int num1 = Integer.parseInt(substr1);
           int num2 = Integer.parseInt(substr2);
           int result = (int) Math.pow(num1+num2, 2);
           if(num == result){
               System.out.println("It is a tech number");
           }else{
               System.out.println("It is not a tech number");
           }

       }else{
           System.out.println("It is not a tech number");
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isTechNumber(num);
        in.close();
    }
}
