import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = sc.nextInt();

         if
        (number%3==0 && number%5==0) {


            System.out.println("Consultadd JAVA Training");
        }
       else if(number%3==0)
        {
            System.out.println("Consultadd");
        }
        else if(number%5==0){
            System.out.println("JAVA Training");
        }


    }

}