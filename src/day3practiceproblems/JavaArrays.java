package day3practiceproblems;

import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element of an array :");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);
        //printArray(arr,size);
        //largestElement(arr,size);
        //smallestElement(arr,size);
        //evenPosition(arr,size);
        //reverseOrder(arr,size);
        //oddPosition(arr,size);
        //duplicateElements(arr,size);
        //ascendingOrder(arr,size);
        //secondLargestElemnet(arr,size);
        frequency(arr, size);
    }

    public static void printArray(int[] arr, int size) {
        System.out.println("Array Elements :");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);

    }

    public static void largestElement(int[] arr, int size) {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element of array: " + max);
    }

    public static void smallestElement(int[] arr, int size) {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallet element of array: " + min);
    }

    public static void evenPosition(int[] arr, int size) {
        System.out.println("Elements which are present on even position:");
        for (int i = 1; i < size; i = i + 2)
            System.out.println(arr[i]);
    }

    public static void reverseOrder(int[] arr, int size) {
        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--)
            System.out.println(arr[i]);
    }

    public static void oddPosition(int[] arr, int size) {
        System.out.println("Elements which are present on odd position:");
        for (int i = 0; i < size; i = i + 2)
            System.out.println(arr[i]);
    }

    public static void duplicateElements(int[] arr, int size) {
        System.out.println("Duplicate elements are :");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }

    public static void ascendingOrder(int[] arr, int size) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in ascending order :");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);
    }

    public static void secondLargestElemnet(int[] arr, int size) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest element of an array :" + arr[size - 2]);

    }

    public static void frequency(int[] arr, int size) {
        int frqncy[] = new int[size];
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frqncy[j] = -1;
                }
            }
            if (frqncy[i] != -1)
                frqncy[i] = count;
        }
        System.out.println("Array element--->frequency");
        for (int i = 0; i < frqncy.length; i++) {
            if (frqncy[i] != -1)
                System.out.println("   " + arr[i] + "   " + frqncy[i]);
        }
    }


}
