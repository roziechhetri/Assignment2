import java.util.Scanner;

public class Task8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");

        char ch = sc.next().charAt(0);
        if(ch=='r' || ch=='R'){
            System.out.println("Found");
        }

       else if(ch=='a' || ch=='A'){
            System.out.println("Found");
        }
        else if(ch=='n' || ch=='N'){
            System.out.println("Found");
        }
         else if(ch=='d' || ch=='D'){
            System.out.println("Found");
        }
        else if(ch=='o' || ch=='O'){
            System.out.println("Found");
        }
        else if(ch=='m' || ch=='M'){
            System.out.println("Found");
        }
            else{
            System.out.println("Not Found");
        }
    }
}
