import java.util.Scanner;

public class day19 {
    // public static void main(String[] args) {
    //     // display(9);
    // }
    // //tail recursion 
    // public static void display(int n ){
    //     if(n<=0){
    //         return;
    //     }
    // //System.out.print(n+" ");
    // display(n-1);
    // //head recursion
    // System.out.print(n+" ");
    // }
    //write a program to find the sum of all the elments in array using recursion
    // public static int sum (int arr[],int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return arr[n-1]+sum(arr,n-1);
    // }
    // public static void main(String[] args) {
    //     int result = sum(new int[]{2,5,6,1,3,9}, 6);
    //     System.out.println("Sum: " + result);
    // }

    //find the index value of the given element in array using recursion
    // public static int index(int arr[],int n,int i){
    //     if(i>=arr.length){
    //         return -1;
    //     }
    //     if(arr[i]==n){
    //         return i;
    //     }
    //     return index(arr,n,i+1);
    // }
    // public static void main(String[] args) {
    //    int result = index(new int[]{2,5,6,1,3,9}, 6, 0);
    //    System.out.println("Index: " + result);
    // }
    //find the maximum element in array using recursion
    public static int max(int arr[],int index,int max){
        if(index==arr.length){
            return max;
        }
        if(arr[index]>max){
            max=arr[index];
        }

        return max(arr,index+1,max);
    }
    public static void main(String[] args) {
        int result = max(new int[]{2,5,6,1,3,9}, 0, Integer.MIN_VALUE);
        System.out.println("Max: " + result);
    }
}
