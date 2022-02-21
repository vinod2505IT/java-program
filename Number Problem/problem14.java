import java.util.Scanner;

public class problem14 {
    public static void DigitToWord(int num){
        String str = Integer.toString(num);
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String resultWord = "";
        for(int i=0; i<str.length(); i++){
            int number = str.charAt(i) - '0';
            resultWord+=words[number];
            resultWord+=" ";

        }
        if(!(resultWord == "")){
            System.out.println(resultWord);
        }else{
            System.out.println("something wrong");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        DigitToWord(num);
        in.close();
    }
}
