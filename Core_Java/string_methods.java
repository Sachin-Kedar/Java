public class string_methods {
    public static void main(String[] args) {
        String name = "Abhinandan";

        int n = 16;

        if (n>55){
            System.out.println("Its greater that 55");
        }
        else if (n>45){
            System.out.println("Its greater that 45");
        }
        else if (n>35){
            System.out.println("Its greater that 35");
        }
        else if (n>15){
            System.out.println("Its greater that 15");
        }


        int x = 4;
        switch(x){
            case 1:
                System.out.println("x is 1");
                break; 
            case 2:
                System.out.println("x is 2");
                break;

            case 3:
                System.out.println("x is 3");
                break;

            case 4:
                System.out.println("x is 4");
                break;
            //default:System.out.println("x is 5");
            
        }

        for(int i=0;i<x;i++){
            System.out.println("The value of x is: "+ i);
        }
    }
}
