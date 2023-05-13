package day3practiceproblems;

public class JavaArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 50, 98, 60, 70, 80, 50};
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        //printArray(arr);
        //largestElement(arr);
        //smallestElement(arr);
        //evenPosition(arr);
        //reverseOrder(arr);
        //oddPosition(arr);
        //duplicateElements(arr);
        ascendingOrder(arr);
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

    public static void smallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallet element of array: " + min);
    }

    public static void evenPosition(int[] arr) {
        System.out.println("Elements which are present on even position:");
        for (int i = 1; i < arr.length; i = i + 2)
            System.out.println(arr[i]);
    }

    public static void reverseOrder(int[] arr) {
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i]);
    }

    public static void oddPosition(int[] arr) {
        System.out.println("Elements which are present on odd position:");
        for (int i = 0; i < arr.length; i = i + 2)
            System.out.println(arr[i]);
    }

    public static void duplicateElements(int[] arr) {
        System.out.println("Duplicate elements are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }

    public static void ascendingOrder(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in ascending order :");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

}
