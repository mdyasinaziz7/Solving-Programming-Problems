import java.util.Scanner;
public class Abir3{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] a = new int [5];
        for (int i = 0 ; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int i;
        int max = a[0];
        int min = a[0];
        int location = 0;
        
        int location2 = 0;
        for (i = 0 ; i < a.length ; i++) {
            if ( a[i] > max) {
                max = a[i];
                location++;
            }
            else if ( a[i] < min ){
                min = a[i];
                location2++;
        }
        
    }
        System.out.println(max);
        System.out.println("largest number " + max + " was found at " + location);
        System.out.println("smaller number " + min + " was found at " + location2);
}
}
                            