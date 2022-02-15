/*
Unique Number Program in Java
A number is said to be unique , if the digits in it are not repeated. for example, 12345 is a unique number. 123445 is not a unique number.
*/
import java.util.Scanner;
public class problem8 {
    public static void isUniqueNum(int num){
        int repeated = 0;
        String s = Integer.toString(num);
        for(int i=0;i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                      repeated++;
                }
            }
            if(repeated > 1){
                System.out.println("Not a unique number");
                break;
            }
            repeated = 0;
        }
        if(repeated == 0){
            System.out.println("It is a unique number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isUniqueNum(num);
        in.close();
    }
}
