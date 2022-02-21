/*
Magic Number(Magic number is the if the sum of its digits recursively are
calculated till a single digit If the single digit is 1 then the number is a magic
number. Magic number is very similar with Happy Number. Example- 226 is said
to be a magic number 2+2+6=10 sum of digits is 10 then again 1+0=1 now we get
a single digit number is 1. if we single digit number will now 1 them it would not a
magic number).
*/
import java.util.*;
public class Problem4 {
    public static void isMagicNumber(int input){
        String strInput = Integer.toString(input);
        int sum = 0;
        while(sum >= 10 || sum == 0){
            for(int i=0; i<strInput.length(); i++){
                int num = strInput.charAt(i) - '0';
                sum+=num;
           }
           strInput = Integer.toString(sum);
           if(sum < 10){
               if(sum==1){
                   System.out.println("Magic Number");
                   break;
                }else{
                    System.out.println("Non Magic Number");
                    break;
                }
           }else{
               sum = 0;
           }
        }
        
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input  =  in.nextInt();
        isMagicNumber(input);
        in.close();
    }
}
