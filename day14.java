public class day14 {
 //linear search
    // public static int linearSearch(int arr[], int target, int index) {
    //     if (index >= arr.length) {
    //         return -1; 
    //     }
    //     if (arr[index] == target) {
    //         return index; 
    //     }
    //     return linearSearch(arr, target, index + 1);
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     int target = 3;
    //     int result = linearSearch(arr, target, 0);
    //     if (result != -1) {
    //         System.out.println("Element found at index: " + result);
    //     } else {
    //         System.out.println("Element not found");
    //     }
    // }   
    //----------------------------------------------------------------------------------------------------
    //quick sort
    // Static void quickSort(int arr[], int low, int high) {
    //     if (low < high) {
    //         int pivotIndex = partition(arr, low, high);
    //         quickSort(arr, low, pivotIndex - 1);
    //         quickSort(arr, pivotIndex + 1, high);
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {5, 2, 9, 1, 5, 6};
    //     quickSort(arr, 0, arr.length - 1);
    //     System.out.println("Sorted array: " + Arrays.toString(arr));
    // }
    // static int partition(int arr[], int low, int high) {
    //     int pivot = arr[high];
    //     int i = low - 1;
    //     for (int j = low; j < high; j++) {
    //         if (arr[j] > pivot) {
    //             i++;
    //             swap(arr, i, j);
    //         }
    //     }
    //     swap(arr, i + 1, high);
    //     return i + 1;
    // }
    // static void swap(int arr[], int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
//    

}
