// public class day9 {
//     // static void characterArrayCompare(String arr[]) {
//     //     String str1 = arr[0];
//     //     String str2 = arr[1];

//     //     // if (str1.equals(str2)) {
//     //     //     System.out.println("The strings are equal.");
//     //     // } else {
//     //     //     System.out.println("The strings are not equal.");
//     //     // }
//     //      if (str1.length() != str2.length()) {
//     //         System.out.println("flase");
//     //         return;
//     //     }

//     //     boolean areEqual = true;
//     //     for (int i = 0; i < str1.length(); i++) {
//     //         if (str1.charAt(i) != str2.charAt(i)) {
//     //             areEqual = false;
//     //             break;
//     //         }
//     //     }

//     //     if (areEqual) {
//     //         System.out.println(areEqual);
//     //     } else {
//     //         System.out.println(areEqual);
//     //     }
//     // }
//     static boolean characterArrayCompare(String str1, String str2){
//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();
//         if (arr1.length != arr2.length) {
//             return false;
//         }
//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] != arr2[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "teja";
//         System.out.println(characterArrayCompare(str1, str2));
//     }
    
// }
//----------------------------------------------------------------------------
// public class day9 {
//     static boolean palindrome(String str) {
//         char[] arr = str.toCharArray();
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {
//             if (arr[left] != arr[right]) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "madam";
//         if (palindrome(str)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
//     }
// }
//----------------------------------------------------------------------------
public class day9 {
    static String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + ('a' - 'A'));
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "HeLLo WoRLD";
        System.out.println("Original String: " + str);
        System.out.println("Lowercase String: " + toLowerCase(str));
    }
}