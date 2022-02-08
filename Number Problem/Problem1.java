/*
Ugly Number Program in Java
----------------------------
A number is said to be an Ugly number if positive numbers whose prime factors only include 2, 3, 5.
For example, 6(2×3), 8(2x2x2), 15(3×5) are ugly numbers while 14(2×7) is not ugly since it includes 
another prime factor 7. Note that 1 is typically treated as an ugly number.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Problem1{
    public static boolean isPrime(int input){
        if(input == 1){
            return false;
        }
        else{
            int itrCount = 0;
            int itr=1;
            while(input >= itr){
                if(input % itr == 0){
                    itrCount++;
                }
                itr++;
            }
            if(itrCount == 2){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void isUglyorNot(int input){
        int itr=1;
        ArrayList <Integer> factorList = new ArrayList<Integer>();
        while(input >= itr){
            if(input % itr == 0){
                 if(isPrime(itr)){
                     factorList.add(itr);
                 }
            }
            itr++;
        }
        int count = 0;
        for(int x: factorList){
            System.out.print(x+" ");
        }
        for(int i=0; i<factorList.size();i++){
            if(factorList.get(i)==2 || factorList.get(i)==3 || factorList.get(i)==5){
                continue;
            }else{
                count++;
                break;
            }
        }
        
        if(count > 0){
            System.out.println("It is not a ugly number");
        }else{
            System.out.println("It is ugly number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        isUglyorNot(input);
        in.close();
    }
}   