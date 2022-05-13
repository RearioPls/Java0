package Tasks_primitive12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(7)));
    }
    static int[] fillArray(int x){
        int[] arr = new int[x];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        return arr;
    }
}
