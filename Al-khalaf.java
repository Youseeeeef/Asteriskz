import java.util.Scanner;

/*
 util package used for obtaining the input of the primitive types
 */ 
public class Main
{
 public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        //Scanner to be able the user input a value
        Scanner sc = new Scanner(System.in);
        int x = z.nextInt();
        //calling the method "displayAsterisk"
        displayAsterk(x);
    }
    //this method  use to display asterisk.
    public static void displayAster(int x){
        //loop for the first triangle
        for (int i = x; i > 0; i--) { 
           //loop to display the space " " in the first triangle.
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");

            }
            //loop to display the asterisk for the first triangle.
            for (int k = 1; k <= i ; k++) {
             
                if (k==1 && i==1) {
                       System.out.print(x+" ");
                }else{
                    System.out.print("* ");  
                
            }
            }
            System.out.println("");

        } 
         //loop for the second triangle
        for (int i = 1; i <= x; i++) {
          //loop to display the space " " for the second triangle.
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");

            }
            //loop to display the asterisk for the first triangle.
            for (int b = 1; b <= i; b++) {
                if (b==1 && i==1) {
                System.out.print(x+" ");
                }else{
                     System.out.print("* ");
                }
            }
            System.out.println("");
         }
    }
    }