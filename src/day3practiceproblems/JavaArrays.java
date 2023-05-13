package day3practiceproblems;

public class JavaArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.println("Array Elements :");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}
