package Tasks_ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
       if(("" + a).contains("0")) {
           System.out.println("да");
       }
       else{
           System.out.println("нет");
       }
    }
}
