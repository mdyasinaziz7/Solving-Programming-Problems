import java.util.Scanner;

public class Task2{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println ("Please type a number");
            a[i] = sc.nextInt();

        }
        System.out.println ("Enter Index");
        int index = sc.nextInt();
        
        System.out.println (a [index - 1]);
    }
}