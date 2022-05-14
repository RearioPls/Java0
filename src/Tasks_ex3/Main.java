package Tasks_ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int w = scan.nextInt();
        int e = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();
        int y = scan.nextInt();
        int sum = q+w+e%2;
        int sum1= r+t+y%2;
        if (sum  == sum1) {
            System.out.println("Счастливый");
        }
        else{
            System.out.println("Не счастливый");
        }
    }
}
