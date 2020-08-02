import java.util.Scanner;

public class Task7 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        float num = sc.nextFloat();

        if(num==0){
            System.out.println("Zero");
        }

        else if(num<0) {
            System.out.println("Negative");
        }

        else if(num>0){
            System.out.println("Positive");
        }

        else if(num<1){
            System.out.println("Small");
        }
        else if(num>1000000){     //For some reason this line is not showing output as it should. It shows positive not Large
            System.out.println("Large");
        }
    }
}
