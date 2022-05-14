package Tasks_ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(random(20,30));
        }

    public static int random(int a,int b){
        return (int)((Math.random()*(a-b)+1))+b;
    }
}

