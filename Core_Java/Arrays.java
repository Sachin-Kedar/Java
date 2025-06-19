import java.util.Scanner;

public class Arrays {
    public static void main (String Args[]){
        int[] arr = {100,98,89,99,76};
        float[] arr1 = {88.8f,99.8f,78.9f,87.6f,56.7f,67.3f};

        // Find out number is present in array or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number you want to find in Array: ");
        
        int ab = sc.nextInt() ;
        boolean isPresent = false;
        for(int a: arr){
            if(a == ab){
                isPresent = true;
                break;  // No need to continue after found
            }
        }
        if(isPresent){
            System.out.println("Entered number is present");

        }
        else{
            System.out.println("Enetred number is not present ");

        }
    }
}
