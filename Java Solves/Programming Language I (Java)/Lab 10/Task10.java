import java.util.Scanner;

public class Task10{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [10];
        for (int i = 0 ; i < a.length ; i++){
            System.out.println ("Please type a Number");
            a[i] = sc.nextInt();
        for (int j = 0; j <= i ; j++){
            System.out.println (a[j]);
        }
    }
}
}
                