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
