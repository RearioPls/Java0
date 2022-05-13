package Tasks_primitive11;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6};
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
