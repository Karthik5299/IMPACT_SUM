// public class day6 {
//     public static void main(String[] args) {
//         int n = 24; 
//         System.out.println("Prime factors of " + n + ":");
//         primeFactors(n);
//     }

//     public static void primeFactors(int n) {
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) { 
//                 System.out.print(i + " ");
//                 while (n % i == 0) {
//                     n /= i; 
//                 }
//             }
//         }
//         if (n > 1) {
//             System.out.print(n); 
//         }
//     }
// }

import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        int target = 2;
        if (isUnique(arr, target)) {
            System.out.println(target + " is unique in the array.");
        } else {
            System.out.println(target + " is not unique in the array.");
        }
    }

    static boolean isUnique(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}