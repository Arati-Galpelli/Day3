package day3practiceproblems;

public class JavaArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 98,  60, 70, 80, 90};
        //printArray(arr);
        largestElement(arr);
    }

    public static void printArray(int[] arr) {
        System.out.println("Array Elements :");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static void largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element of array: " + max);
    }

}
