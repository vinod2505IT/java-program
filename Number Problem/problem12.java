/*
Twin Prime Program in Java
A twin prime is a prime number that is either 2 less or 2 more than another prime number—for example, either member of the twin prime pair (41, 43). In other words, a twin prime is a prime that has a prime gap of two.
*/
import java.util.Scanner;
public class problem12 {
    public static boolean isPrime(int num){
        int count = 0;
        int j = 1;
        while(j <= num){
            if(num % j == 0){
                count++;
            }
            j++;
            if(count > 2){
                break;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
        
    }
    public static void isTwinPrime(int num1, int num2){
        int sub = num1-num2;
        if(sub == 2 || sub == -2){
               if(isPrime(num1) && isPrime(num2)){
                   System.out.println("It is a twin prime number");
               }else{
                   System.out.println("It is not a twin prime number");
               }
        }else{
            System.out.println("It is not a twin prime");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        isTwinPrime(num1,num2);
        in.close();

    }
}
