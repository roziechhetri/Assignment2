import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 - 5");
        int num = sc.nextInt();



        System.out.println("Enter the first variable");
        int variable1 = sc.nextInt();
        System.out.println("Enter the second variable");
        int variable2 = sc.nextInt();




       switch (num) {
           case 1 :
               System.out.println(variable1+variable2);
               break;

           case 2 :
               System.out.println(variable1-variable2);
               break;

           case 3 :
               System.out.println(variable1/variable2);
               break;

           case 4:
               System.out.println(variable1*variable2);

               break;
           case 5:
               if(num == 5){
                   System.out.println("Calculate average");
               }
               System.out.println("Enter the first number");
               int num1 = sc.nextInt();
               System.out.println("Enter the second number");
               int num2 = sc.nextInt();
               int average = (num1+num2)/2;
               System.out.println(average);
               break;

               default:
                   System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
                   return;
       }



       }
    }

