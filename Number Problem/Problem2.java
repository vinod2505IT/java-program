/*
A perfect number is a positive integer that is equal to the sum of its positive divisors, 
excluding the number itself. For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a 
perfect number.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Problem2 {
    public static String isPerfectNumber(int input){
        String result = "";
        ArrayList <Integer> divisorsOfInput = new ArrayList<Integer>();
        int itr =1;
        int sum = 0;
        while(input > itr){
             if(input % itr == 0){
                 divisorsOfInput.add(itr);
             }
             itr++;
        }
        for(int i=0; i<divisorsOfInput.size(); i++){
            sum+=divisorsOfInput.get(i);
        }
        if(sum == input){
            result = "It is a perfect number";
        }else{
            result = "It is not a perfect Number";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String output = isPerfectNumber(input);
        System.out.println(output);
        in.close();
    } 
}
