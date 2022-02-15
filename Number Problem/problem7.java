/*
A number is called a twisted prime number if it is a prime number and reverse of this number is also a prime number. 
*/
import java.util.Scanner;
public class problem7 {
    public static void isTwistedPrime(int num){
        String s = Integer.toString(num);
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }

        int num1 = Integer.parseInt(s1);
        
        int count = 0;
        int j = 1;
        while(j <= num1){
            if(num1 % j == 0){
                count++;
            }
            j++;
        }

        if(count == 2){
            System.out.println("It is a twisted prime number");
        }else{
            System.out.println("It is not a twisted prime number");
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any prime number: ");
        int num = in.nextInt();
        isTwistedPrime(num);
        in.close();
    }
}
