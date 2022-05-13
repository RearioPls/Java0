package Tasks_primitive6;

public class Main {
    public static void main(String[] args) {
        System.out.println(incrementIfPositive(0));
    }
    public static int incrementIfPositive(int a) {
        if(a>0){
            a++;
        }
        return a;
    }
}
