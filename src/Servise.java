import java.util.Random;
import java.util.Scanner;

public class Servise {
    public static int  Scaner(){
        Scanner scn =new Scanner(System.in);
        int x = scn.nextInt();
        return x;
    }
    public static int  RandomComputer() {
        Random rnd = new Random();
       int result = rnd.nextInt(12)+1;
       if (result<2){
           result++;
           return result;
       }
       return result;
    }
    public static int  Random() {
        Random rnd = new Random();
        int result = rnd.nextInt(6)+1;
        return result;
    }
}
