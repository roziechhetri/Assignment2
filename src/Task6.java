import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        int num = sc.nextInt();


        if (num % 2 == 1) {
            System.out.println("NEW");

        } else if (num % 2 == 0) {
            if (num > 2 && num < 5) {
                System.out.println("OLD");
            }


            else if(num%2==0 ) {
                if(num>6 && num<30)
                System.out.println("New");
            }

            else if(num>=30)
            {

                System.out.println("Old");
            }
        }
    }
}
