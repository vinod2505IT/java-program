/*
Special Number Program in Java(A number is said to be special number when
the sum of factorial of its digits is equal to the number itself. Example- 145 is a
Special Number as 1!+4!+5!=145.A number is said to be Krishnamurthy Number
when the sum of factorial of its digits is equal to the number itself. Example- 145
is a Krishnamurthy Number as 1!+4!+5!=145)
*/

import java.util.Scanner;

public class problem13 {
    public static void isSpecialNumber(int num){
       String str = Integer.toString(num);
       int sum = 1;
       int total = 0;
       for(int i=0; i<str.length(); i++){
           int loop = str.charAt(i) - '0';
           while(!(loop==0)){
               sum =sum*loop;
               loop--;
           }
           total +=sum;
           sum=1;
       }
       if(num == total){
           System.out.println("It is a special Number");
       }else{
           System.out.println("It is not a special Number");
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isSpecialNumber(num);
        in.close();
    }
    
}
