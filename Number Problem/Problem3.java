import java.util.Scanner;
public class Problem3{
    public static void isPronString(int input){
        if(input == 0){
            System.out.println("Pronic Number");
        }else{
            for(int i = 1; i<input; i++){
                    int j = i+1;
                    int num = i*j;
                    if(input == num){
                        System.out.println("Pronic Number");
                        break;
                    }else if(input < num){
                        System.out.println("Non Pronic Number");
                        break;
                    }
                }
            }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        isPronString(input);
        in.close();
    }
}