// public class day16 {
//         static void insertion_sort(int[] arr){
//             for(int i=1;i<arr.length;i++){
//                 for(int j=i;j>0;j--){
//                     if(arr[j]<arr[j-1]){
//                         swap(arr,j,j-1);
//                     }
//                     else{
//                         break;
//                     }
//                 }
//             }
//         }
//          static void swap(int[]arr,int i,int j){
//             int temp = arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     public static void main(String[] args) {
//         int [] arr ={9,18,3,4,27,-1,0};
//         insertion_sort(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
//----------------------------------------------------------------------------------------------

import java.util.Scanner;

// public class day16{
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int n = scanner.nextInt();
    //     if(n < 0) {
    //         System.out.println("negative number");
    //         return;
    //     }
//         else if(n==0){
//             System.out.println("zero");
//             return;
//         }
//         else{
//             System.out.println("positive number");
//         }
//     }
// }

//----------------------------------------------------------------------------------------------
// public class day16 {

    
// public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         if(n%2 == 0) {
//             System.out.println("even number");
//         }
//         else {
//             System.out.println("odd number");
//         }
//     }
// }
//----------------------------------------------------------------------------------------------

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, m, y;
        while (true) {
            d = scanner.nextInt();
            m = scanner.nextInt();
            y = scanner.nextInt();

            int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
            boolean isLeap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            if (isLeap) daysInMonth[2] = 29;

            if (m < 1 || m > 12 || d < 1 || d > daysInMonth[m] || y < 0) {
                System.out.println("invalid date, enter again:");
                continue;
            }
            d++;
            if (d > daysInMonth[m]) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                }
            }
            System.out.println(d + " " + m + " " + y);
            break;
        }
        scanner.close();
    }
}