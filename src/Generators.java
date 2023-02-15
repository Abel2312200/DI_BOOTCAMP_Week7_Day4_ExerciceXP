
import java.util.Scanner;

public class Generators {

    public static void main(String[] args){
        Scanner se = new Scanner(System.in);
        int X = 1, N  = 1;
        long numberToDisplay;

        System.out.println("Please, enter the biggest number which can appear : ");
        X = se.nextInt();

        System.out.println("Please, enter the number of digit to display : ");
        N = se.nextInt();

        System.out.println("Diplay number : ");
        for (int i = 0; i < N; i++) {
            numberToDisplay = (long)(Math.random()*X) ;
            System.out.println(numberToDisplay);
        }


    }
}
