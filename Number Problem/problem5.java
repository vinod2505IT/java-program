import java.util.ArrayList;
import java.util.Scanner;


public class problem5 {
    public static void printPrimeNumber(int range){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num = 2;
        while (range != 0){
            int itr = 1;
            int count = 0;
            while(itr <= num){
               if(num%itr==0){
                  count++;
               }
               itr++;
            }
            if(count <= 2){
                arr.add(num);
                range--;
            }
            num++;
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        printPrimeNumber(range);
        in.close();
    }
}
