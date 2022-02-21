/*
Pronic Number Program in Java(A number is said to be a pronic number if
product of two consecutive integers is equal to the number, is called a pronic
number. Example- 42 is said to be a pronic number 42=6×7, here 6 and 7 are
consecutive integers)
*/
import java.util.Scanner;
public class Problem3{
    public static void isPronString(int input){
        if(input == 0){
            System.out.println("Pronic Number");
        }else{
            for(int i = 1; i<input; i++){
                    int j = i+1;
                    int num = i*j;
                    if(input == num){
                        System.out.println("Pronic Number");
                        break;
                    }else if(input < num){
                        System.out.println("Non Pronic Number");
                        break;
                    }
                }
            }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        isPronString(input);
        in.close();
    }
}