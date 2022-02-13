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
