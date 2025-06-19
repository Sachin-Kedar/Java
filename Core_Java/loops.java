
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        
        
        // Problem 1
        // for (int i = a;i>0;i--){
        //     for(int j= i;j>0;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println("\n");
        // }

        // Problem 2
       // write a program to sum first a even numbers using while loop
    //    int sum = 0;
    //     while(a>0){
    //         if(a%2==0){
    //             sum+=a;
    //         }
    //         a--;
    //     }
    //     System.out.println("The sum of even numbers is "+ sum);


        // Problem 3
        // find factorial of given number
        int total =1;
        for(int i=a;i>=1;i--){
            total *= i; 
        }
        System.out.println("Total is:"+total);





    }
}
