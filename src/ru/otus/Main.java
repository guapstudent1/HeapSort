package ru.otus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            System.out.println("print");
            Thread.sleep(1000);
            System.out.println("out");
            Thread.sleep(1000);
            System.out.println("an array");
        }catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        int [] arr = {3,0,1,4,1,5,9,2,6};
        sort(arr);
        for (int j : arr) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
    private static void swap(int []arr, int a, int b)
    {
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    private static void sort(int[] arr)
    {
        swap(arr, 0,3);
        swap(arr, 2,5);
        swap(arr,3,6);
        swap(arr, 5, 6);

    }
}
