//Checking to see whether if any dupli's are there or not (in the 10 inputs).
import java.util.Scanner;

public class Task11{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length; i++){
            System.out.println ("Please Enter a number");
            a[i] = sc.nextInt();
            
            boolean gotit = false;
            for (int j = 0; j < i ; j++){
                if(a[i] == a[j]) {
                    gotit = true;
                    System.out.println ("Duplicate try again");
                    i--;
                    break;
                }
            }
        }
        for (int i = 0 ; i < a.length ; i++){
        System.out.println ("Inputed number's were " + a [i]);
        }
    }
}
