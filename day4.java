import java.util.Scanner;
public class day4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            
        }
    //     int sum=0;
    //     for (int i=0; i<arr.length;i++){
    //         sum = sum+arr[i];
    // }
    // System.out.println(sum);
    // int max = arr[0];
    // int min = arr[0];
    // for (int i=0; i<arr.length;i++){
        // if (arr[i]>max){
        //     max = arr[i];
        // }
    //     if(arr[i]<min){
    //         min = arr[i];
    //     }
    // }
    // System.out.println(max);
    // System.out.println(min);
    // int max = Integer.MIN_VALUE;
    // int secmax = Integer.MIN_VALUE;
    // for (int i=0; i<arr.length;i++){
    //     if (arr[i]>max){
    //         secmax = max;
    //         max = arr[i];
    //     }
    //     else if (arr[i]>secmax && arr[i]!=max){
    //         secmax = arr[i];
    //     }
    // }
    // System.out.println(secmax);
    boolean isdup = false;
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                isdup=true;
            }
            }
            if (isdup==true){
                System.out.println("Duplicate found");
                break;
                
            } else {
                System.out.println("Duplicate not found");
            }
        
    }
    
        
}
}