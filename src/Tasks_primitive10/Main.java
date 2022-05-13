package Tasks_primitive10;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMinFromTwo(5, 4)); // В задаче не было указано что нужно вывести что то на консоль
        System.out.println(getMinFromFour(1, 5, 6, 8)); // В задаче не было указано что нужно вывести что то на консоль
    }

    public static int getMinFromTwo(int x, int y) {
        return Math.min(x, y);
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
        return getMinFromTwo(getMinFromTwo(x, y), getMinFromTwo(m, n));
    }
}
