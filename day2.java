import java.util.Scanner;

// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("select the operator :+ , - , * , / , %,= ");
//         char operator = sc.next().charAt(0);
//         switch (operator) {
//             case '+':
//                 System.out.println("Addition: " + (a + b));
//                 break;
//             case '-':
//                 System.out.println("Subtraction: " + (a - b));
//                 break;
//             case '*':
//                 System.out.println("multiplication: " + (a * b));
//                 break;
//             case '/':
//                 if (b != 0) {
//                     System.out.println("Division: " + (a / b));
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 }
//                 break;
//             case '%':
//                 if (b != 0) {
//                     System.out.println("Modulus: " + (a % b));
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 }
//                 break;
//             case '=':
                
//                 break;
        
//             default:
//                 System.out.println("Invalid operator. Please use +, -, *, /, or %.");
//                 break;
//         }
//     }
// }
//------------------------------------------------------
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int a = sc.nextInt(); 
//         int b = sc.nextInt();
//         System.out.println(" product of two numbers is: " + (a*b));
//     }
// }
//------------------------------------------------------
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int a = sc.nextInt();
//         boolean isDivisible = (a % 5 == 0 && a % 10 == 0);
//         if (isDivisible){
//             System.out.println(isDivisible);
//         }
//         else{
//             System.out.println(isDivisible);
            
//         }
//     }
// }
//------------------------------------------------------
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        char vowel = sc.next().charAt(0);
        boolean isvowel = (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ||
                           vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U');
        if (isvowel){
            System.out.println(isvowel);
        }
        else{
            System.out.println(isvowel);
        }
    }
}