import java.util.Scanner;

public class Task19 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          
          int lineCount = sc.nextInt();
          int spaceCount = lineCount;
          int starCount = 1;
          
          for(int i = 1; i <= lineCount; i++){
               spaceCount--;
               for(int j = 0; j < spaceCount; j++){
                    System.out.print(" ");
               }
               for(int j = 0; j < starCount ; j++){
                    System.out.print("*");
               }
               for(int j = 0; j< spaceCount; j++){
                    System.out.print(" ");
               }
               System.out.println();
               starCount += 2;
          }
     }
}