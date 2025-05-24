public class day13 {
    //number theory questions
    //palindrome number
    // static boolean isPalindrome(int n) {
    //     int original = n;
    //     int reversed = 0;
    //     while (n > 0) {
    //         int digit = n % 10;
    //         reversed = reversed * 10 + digit;
    //         n /= 10;
    //     }
    //     return original == reversed;
    // }
    // public static void main(String[] args) {
    //     int number = 121; // Example number
    //     if (isPalindrome(number)) {
    //         System.out.println(number + " is a palindrome.");
    //     } else {
    //         System.out.println(number + " is not a palindrome.");
    //     }
    // }
    //--------------------------------------------------------------------------------
    //armstrong number
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        int number = 153; // Example number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    //----------------------------------------------------------------------------------------------------
    //perfect number
    // static boolean isPerfect(int n) {
    //     int sum = 0;
    //     for (int i = 1; i <= n / 2; i++) {
    //         if (n % i == 0) {
    //             sum += i;
    //         }
    //     }
    //     return sum == n;
    // }
    // public static void main(String[] args) {
    //     int number = 28; // Example number
    //     if (isPerfect(number)) {
    //         System.out.println(number + " is a perfect number.");
    //     } else {
    //         System.out.println(number + " is not a perfect number.");
    //     }
    // }
}
