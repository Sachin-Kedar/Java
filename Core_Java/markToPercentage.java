import java.util.Scanner;

public class markToPercentage{
    public static void main(String [] args){
        System.out.println("Tell me how much subjects you have: ");
        Scanner sc = new Scanner (System.in);
        float a= sc.nextFloat();
        float sum = 0;
        for (int b = 0; b<a;b++){
            System.out.println("Enter marks of subject" + (b+1));
            float x= sc.nextFloat();
            sum = sum + x;
        }
        float total  = (sum/a);
        System.out.println("Total percentage is: "+ total +"%");



    }
}