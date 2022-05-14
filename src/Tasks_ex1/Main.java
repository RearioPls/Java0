package Tasks_ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("Ноль");
        }
        else if(a > 0 || a<0){
            System.out.println(a);
        }
    }
}
