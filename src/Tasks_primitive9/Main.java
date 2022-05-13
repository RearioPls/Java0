package Tasks_primitive9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Здраствуйте, " + s + "!");
    }
}
