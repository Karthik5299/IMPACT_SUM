import java.util.Arrays;
import java.util.Scanner;

public class day20 {
    //Recursive binary search
    // static void binarySearch(int arr[], int target, int low, int high) {
    //     if (low > high) {
    //         System.out.println("Element not found");
    //         return;
    //     }
    //     int mid = (low + high) / 2;
    //     if (arr[mid] == target) {
    //         System.out.println("Element found at index: " + mid);
    //         return;
    //     } else if (arr[mid] < target) {
    //         binarySearch(arr, target, mid + 1, high);
    //     } else {
    //         binarySearch(arr, target, low, mid - 1);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1,3,5,7,9,11,13,15}; 
    //     int target = 3;
    //     binarySearch(arr, target, 0, arr.length - 1);
    // }
//---------------------------------------------------------------------------------------------------------------------------------------------------
    // palindrome using recursion
    // static boolean isPalindrome(String str, int start, int end){
    //     if(start>=end){
    //         return true;
    //     }
    //     if(str.charAt(start) != str.charAt(end)){
    //         return false;
    //     }
    //     return isPalindrome(str, start+1, end-1);

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a string1: ");
    //     String str1 = sc.nextLine();
    //     boolean result = isPalindrome(str1, 0, str1.length() - 1);
    //     System.out.println(result);
//---------------------------------------------------------------------------------------------------------------------------------------------------
//wap to count the frequency of the target element in an array

static int countFrequency(int arr[], int index,int target,int count){
    if(index == arr.length){
        return count;
    }
    if(arr[index] == target){
        count=count+1;
    }
    return countFrequency(arr, index + 1, target, count);
}
    
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 4, 2, 5};
    int target = 2;
    System.out.println("Frequency of " + target + ": " + countFrequency(arr, 0, target, 0));
}
}