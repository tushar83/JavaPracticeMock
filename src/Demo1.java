import java.util.Scanner;

public class Demo1 {
    public static void main (String [] args){
        //If else
        //Yes, No


        if (true){
            System.out.println("True");
        }else {
            System.out.println("false");
        }

        if(true){
            System.out.println("Only If");
        }

        //What If -Number --> 20, <20, <10 -->


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 20){
            System.out.println("Only If");
        }
        

    }
}
