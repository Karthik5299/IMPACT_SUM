//BUBBLE SORT
// Time Complexity: O(n^2)
// public class day10 {
//     static void bubblesort(int[]arr){
//         boolean isswapped = true;
//         for (int i = 0; i < arr.length;i++){
//             for(int j=1;j<arr.length-i;j++){
//                 if(arr[j-1]>arr[j]){
//                     swap(arr,j-1,j);
//                     isswapped = true;
//                 }
//             }
//         }
//           if(isswapped=true){
//                 System.out.println("Array is sorted");
//             } else {
//                 System.out.println("Array is not sorted");
//             }
//     }
//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,8,9,5,6,2 };
//         bubblesort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
//---------------------------------------------------------------------------------------------
// INSERTION SORT
// Time Complexity: (worst case):O(n^2)
// Time Complexity: (best case):O(1)
// public class day10{
    // static void insertion_sort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j =i+1;j>0;j--){
    //             if (arr[j]<arr[j-1]) {
    //                 swap(arr,j,j-1);  
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
        

    // }
    //     static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
//     public static void main(String[] args) {
//         int[] arr = {5,8,9,5,6,2 };
//         insertion_sort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
//---------------------------------------------------------------------------------------------
//STRING SORT
// public class day10 {
//     static void string_sort( char[] arr){
//         //char[] arr = str.toCharArray();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if(arr[j]<arr[j-1]){
//                     swap(arr,j,j-1);
//                 }
//             }
//         }

//     }
//     static void swap(char[] arr, int i, int j) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     public static void main(String[] args) {
//         String str = "adcb";
//         char[] ch = str.toCharArray();
//         string_sort(ch);
//         for (int i = 0; i < ch.length; i++) {
//             System.out.print(ch[i] + " ");
//         }
//     }
// }
//---------------------------------------------------------------------------------------------
// public class day10 {
//     private static int binarySearch(int[] numbers, int numtofind) {
//         int low = 0;
//         int high = numbers.length - 1;
//         while (low <= high) {
//             int middleposition = (low + high) / 2;
//             int middlenum = numbers[middleposition];
//             if (middlenum == numtofind) {
//                 return middleposition;
//             } else if (middlenum < numtofind) {
//                 low = middleposition + 1;
//             } else {
//                 high = middleposition - 1;
//             }
//         }
//         return -1; 
//     }

//     //LOWER BOUND

// private static int lowerBound(int[] numbers, int numtofind) {
//     int low = 0;
//     int high = numbers.length - 1;
//     while (low <= high) {
//         int middleposition = (low + high) / 2;
//         if (numbers[middleposition] < numtofind) {
//             low = middleposition + 1;
//         } else {
//             high = middleposition - 1;
//         }
//     }
//     return low; 
// }
// //UPPER BOUND
// private static int upperBound(int[] numbers, int numtofind) {
//     int low = 0;
//     int high = numbers.length - 1;
//     while (low <= high) {
//         int middleposition = (low + high) / 2;
//         if (numbers[middleposition] <= numtofind) {
//             low = middleposition + 1;
//         } else {
//             high = middleposition - 1;
//         }
//     }
//     return low;
// }

//     public static void main(String[] args) {
//         int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         int numtofind = 2;
//         int result = binarySearch(numbers, numtofind);
//         System.out.println("Number found at index: " + result);
//         System.out.println("Lower bound index: " + lowerBound(numbers, numtofind));
//         System.out.println("Upper bound index: " + upperBound(numbers, numtofind));
//     }
// }
//---------------------------------------------------------------------------------------------
// public class day10 {
//     private static int linearSearch(int[] numbers, int numtofind) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == numtofind) {
//                 return i;
//             }
//         }
//         return -1; 
//     }

//     public static void main(String[] args) {
//         int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         int numtofind = 2;
//         int result = linearSearch(numbers, numtofind);
//         System.out.println("Number found at index: " + result);
//     }
    
// }


