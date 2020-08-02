import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
       


        while (true ){


           // num++;
            if (sc.nextInt() < 0) {
                System.out.println("It's over");
                break;

            }
            else{System.out.println("Good going");

            }
        }


    }

}









