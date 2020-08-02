public class Task3{

    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int c = 30;
        int avg = ( a +  b +  c ) / 3;
        System.out.println( "avg, " + avg );

        if(avg >= a && avg >=b && avg >= c){
            System.out.println("avg is greater than a,b,c");}

            else if (avg >= a && avg >= c) {
            System.out.println( "avg is greater than a, c");}

            else if( avg >= b && avg >= c){
            System.out.println("avg is greater than b, c");}

            else if(avg>=b){
            System.out.println("avg is greater than b");
           }
          else if(avg>=a){
            System.out.println("avg is greater than a");
          }
           else if(avg>=c){
            System.out.println("avg is greater than c");
          }
           else {
            System.out.println("avg is the highest");
        }
    }

}
