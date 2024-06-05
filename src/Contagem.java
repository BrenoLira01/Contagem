import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continued = true;

        System.out.println("WELCOME TO SCORE");
        System.out.println("choose the starting and ending number");

        while (continued){

            int x = Integer.parseInt(scanner.next());
            int y = Integer.parseInt(scanner.next());

            if ( x < y ){
                for (int i = x; i <= y ; i++ ){
                    System.out.print( i + ",");
                }
            } else if (x >= y) {
                for (int i = x; i >= y ; i-- ){
                    System.out.print( i + ",");
                }

            }
          System.out.println("End of count");
        }
    }
}
