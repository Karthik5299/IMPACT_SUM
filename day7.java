// public class day7 {
//     public static void main(String[] args) {
//         String str = "hello world";
//         String reversedStr = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversedStr += str.charAt(i);
//         }
//         System.out.println("Reversed string: " + reversedStr);
//     }
    
// }
//------------------------------------------------------------------------------pu
import java.util.Scanner;

// public class day7 {

//     public static boolean isPalindrome(String str) {
//         int left = 0;
//         int rigth = str.length() - 1;

//         while (left < rigth) {
//             if (str.charAt(left) != str.charAt(rigth)) {
//                 return false;
//             }
//             left++;
//             rigth--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String inputString = scanner.nextLine();
//         scanner.close();

//         if (isPalindrome(inputString)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
//     }
// }

//---------------------------------------------------------------------------
// public class day7{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String inputString = scanner.nextLine();
//         inputString = inputString.toLowerCase();
//         int vowelCount = 0;
//         for(int i=0;i<inputString.length();i++){
//             char ch = inputString.charAt(i);
//             if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 vowelCount++;
//             }
//             System.out.println("Number of vowels: " + vowelCount);

//         }
//     }
// }
// //---------------------------------------------------------------------------
// public class day7{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String inputString = scanner.nextLine();
//         inputString = inputString.toLowerCase();
//         int Count = 0;
//         for(int i=0;i<inputString.length();i++){
//             char ch = inputString.charAt(i);
//             if(ch== 'a'){
//                 Count++;
//             }

//         }
//         System.out.println("Number of a: " + Count);

//     }
// }
//---------------------------------------------------------------------------\
public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a string2: ");
        String str2 = sc.nextLine();
        boolean isEqual = true;
        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        sc.close();
    }
}