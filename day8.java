// // Linear Search in Java
// public class day8 {
//     // static int linearSearch(int arr[], int x) {
//     static int findDuplicates(int arr[]) {
//         // int Count=0;
//         // for (int i = 0; i < arr.length; i++) {
//         //     if (arr[i] == x) {
//         //         Count++;
//         //     }
//         // }
//         // for (int i = 0; i < arr.length; i++) {
//         //     if (arr[i] == x) {
//         //         return i;
//         //     }
//         // }
//         //return Count;
//         boolean found = false;
//         for (int i = 0; i < arr.length; i++) {
//             for(int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     found=true;
//                     break;
//                 }
//             }
//         }
//         if (!found) {
//             System.out.println(found);;
//             return -1;
//         } else {
//             System.out.println(found);
//             return 0;
            
//         }
        
//     }

//     public static void main(String[] args) {
//         // int [] arr = {2, 5, 7, 4, 3, 6};
//         int [] arr = {2, 5, 7, 4, 3, 6, 3};
//         // int x = 3;
//        findDuplicates(arr);
//     }
// }

//----------------------------------------------------------------------------
public class day8 {
    static void countEvenAndOdd(int arr[]) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 3, 6};
        countEvenAndOdd(arr);
    }
}
