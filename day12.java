// public class day12 {
//     static char charAscii(int target,char[]ch) {
//         for (int i = 0; i < ch.length; i++) {
//             if (ch[i] == target) {
//                 return ch[i];
//             }
//         }
//         return '\0';
//     }
//     public static void main(String[] args) {
//         char[] ch = {'a', 'b', 'c', 'd', 'e'};
//         char target = 'c';
//         System.err.println(charAscii(target, ch));

//     }
// }
//-------------------------------------------------------------------------------------
// public class day12 {
//     static char charAscii(int target,char[]ch) {
//         for (int i = 0; i < ch.length; i++) {
//             if ((int)ch[i] == target) {
//                 if ((int)ch[i]==target) {
//                     return Character.toUpperCase(ch[i]);
//                 }
                
//             }
//         }
//         return '\0';
//     }
//     public static void main(String[] args) {
//         char[] ch = {'a', 'b', 'c', 'd', 'e'};
//         System.err.println(charAscii(99, ch));
//     }
// }
//-------------------------------------------------------------------------------------
public class day12 {
    static void printEvenAscii(char[]ch) {
        for (int i = 0; i < ch.length; i++) {
            int asciiValue = (int)ch[i];
            if (asciiValue%2 == 0) {
               System.err.println(ch[i]);
            }
        }
    }
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        printEvenAscii(ch);
    }
}